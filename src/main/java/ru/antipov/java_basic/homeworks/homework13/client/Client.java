package ru.antipov.java_basic.homeworks.homework13.client;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in);
        ) {
            ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
            while (true) {
                System.out.println("Подключились к серверу");
                String message = inputStream.readUTF();
                System.out.println(message);
                System.out.println("Введите первое число:");
                double number1 = scanner.nextDouble();
                outputStream.writeDouble(number1);
                System.out.println("Введите второе число:");
                double number2 = scanner.nextDouble();
                outputStream.writeDouble(number2);
                System.out.println("Введите операцию:");
                String operation = scanner.next();
                outputStream.writeUTF(operation);
                double result = inputStream.readDouble();
                System.out.println("Результат вычислений: " + result);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Реализация отправки сообщения пользователем выведена в отдельный метод.
     * В ДЗ метод напрямую не используется. Заготовка урока.
     */
    public static void userMessage(ExampleClient client) throws IOException {
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Введите сообщение:");
                String userMessage = scanner.nextLine();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);
            }
        }
    }
}
