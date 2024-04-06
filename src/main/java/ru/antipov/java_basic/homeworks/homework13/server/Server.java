package ru.antipov.java_basic.homeworks.homework13.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {


    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (ServerSocket socket = new ServerSocket(8080);) {
            Calculate calculate = new Calculator();
            System.out.println("Сервер запущен, ждем подключения клиента....");
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);

            while (true) {
                String operationMessage = "Доступные операции: +, -, *, /";
                outputStream.writeUTF(operationMessage);
                double number1 = inputStream.readDouble();
                System.out.println("Число: " + number1);
                double number2 = inputStream.readDouble();
                System.out.println("Число: " + number2);
                String operation = inputStream.readUTF();
                System.out.println("Операнд: " + operation);
                switch (operation) {
                    case "+" -> outputStream.writeDouble(calculate.sum(number1, number2));
                    case "-" -> outputStream.writeDouble(calculate.diff(number1, number2));
                    case "*" -> outputStream.writeDouble(calculate.prod(number1, number2));
                    case "/" -> outputStream.writeDouble(calculate.quot(number1, number2));
                    default -> System.out.println("Некорректный ввод данных");
                }
                outputStream.flush();
            }
        }
    }

    /**
     * Метод перевода в верхний регистр сообщения пользователя. Не используется в ДЗ.
     * Заготовка урока.
     */
    public static String transform(String input) {
        return input.toUpperCase();
    }
}
