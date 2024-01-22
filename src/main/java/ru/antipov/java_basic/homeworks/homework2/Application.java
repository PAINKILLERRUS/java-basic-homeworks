package ru.antipov.java_basic.homeworks.homework2;

import java.util.Arrays;

public class Application {
    //1)
    public static void outputString(int count, String s) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    //2) Использовал foreach
    public static void arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 5)
                sum += i;
        }
        System.out.println(sum);
    }

    //3
    public static void fillArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    //4
    public static void increasingArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + number;
        }
        System.out.println(Arrays.toString(arr));
    }

    //5
    public static void arrayPartSum(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 += array[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма " + sum1 + " левой половины массива больше");
        } else if (sum2 > sum1) {
            System.out.println("Сумма " + sum2 + " правой половины масиива больше");
        } else System.out.println("Суммы равны");
    }
}
