package ru.antipov.java_basic.homeworks.homework1;

import java.util.Scanner;

//Создал отдельный класс для запуска методов с консоли. Использую не изученный еще switch  и лямбды.
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Введите число от 1 до 5");
            number = scanner.nextInt();
            switch (number) {
                case 1 -> Application.greetings();
                case 2 -> Application.checkSign(3, 4, 5);
                case 3 -> Application.selectColour(40);
                case 4 -> Application.compareNumbers(5, 3);
                case 5 -> Application.addOrSubtractAndPrint(5, 6, true);
            }
        } while (number == 1 || number <= 5);
    }
}
