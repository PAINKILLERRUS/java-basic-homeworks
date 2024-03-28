package ru.antipov.java_basic.homeworks.homework13.client;

import ru.antipov.java_basic.homeworks.homework13.server.Calculate;
import ru.antipov.java_basic.homeworks.homework13.server.Calculator;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
            calculation(client);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calculation(ExampleClient client) {
        Calculate calculate = new Calculator();
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Доступные операции: +, -, *, /");
            System.out.println("Введите первое число:");
            double number1 = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double number2 = scanner.nextDouble();
            System.out.println("Введите операцию:");
            String operation = scanner.nextLine();
            boolean exit = true;
            while (exit) {
                switch (operation) {
                    case "+" -> {
                        calculate.sum(number1, number2);
                        exit = false;
                    }
                    case "-" -> {
                        calculate.diff(number1, number2);
                        exit = false;
                    }
                    case "*" -> {
                        calculate.prod(number1, number2);
                        exit = false;
                    }
                    case "/" -> {
                        calculate.quot(number1, number2);
                        exit = false;
                    }
                    default -> {
                        System.out.println("Некорректный ввод данных");
                        exit = false;
                    }
                }
            }
            client.calc(number1, number2, operation);
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
                String userMessage = scanner.next();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);
            }
        }
    }
}
