package ru.antipov.java_basic.homeworks.homework1;

public class Application {

    // 1) использовал символ переноса каретки вместо написания 4 раза оператора sout
    public static void greetings() {
        System.out.println("Hello\nworld\nfrom\nJava");
    }

    // 2) скобки не стал указывать, потому что после if стоит один оператор вывода
    public static void checkSign(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;

        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    // 3) Использовал конструкцию else if
    public static void selectColour(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data == 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4)
    public static void compareNumbers(int a, int b) {
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }

    //5)
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true)
            System.out.println("Результат сложения initValue и delta = " + (initValue + delta));
        else
            System.out.println("Результат вычитания initValue и delta = " + (initValue - delta));
    }
}
