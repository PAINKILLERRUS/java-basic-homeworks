package ru.antipov.java_basic.homeworks.homework3;

public class Application {

    //1)
    public static void sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма всех элементов массива > 0 равна: " + sum);
    }

    //2)
    public static void printSquare(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //3)
    public static void zeroingArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || (i + j) == arr.length - 1) {
                    System.out.print(0 + " ");
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }

    //4)
    public static void findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Максимальное значение массива равно: " + max);
    }

    public static int countLineArray(int[][] array) {
        if (array.length < 2)
            return -1;
        int sumLine = 0;
        for (int i = 0; i < array[1].length; i++) {
            sumLine += array[1][i];
        }
        return sumLine;
    }
}
