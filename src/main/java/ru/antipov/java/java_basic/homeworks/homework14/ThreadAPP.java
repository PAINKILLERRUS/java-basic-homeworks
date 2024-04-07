package ru.antipov.java.java_basic.homeworks.homework14;

import java.util.Arrays;

/**
 * Задал количество элементов в массиве при его создании равное 1_000_000.
 * При попытке создания массива в 100_000_000 выпадает ошибка о недотстатке памяти, слабое железо
 */

public class ThreadAPP implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        createMultiThreadArray(new double[1_000_000]);
    }

    public synchronized static void createMultiThreadArray(double[] arr) throws InterruptedException {
        long executionTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 250_000; i++) {
                arr[i] = i + 1;
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 250_000; i < 500_000; i++) {
                arr[i] = i + 1;
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 500_000; i < 750_000; i++) {
                arr[i] = i + 1;
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 750_000; i < 1_000_000; i++) {
                arr[i] = i + 1;
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(Arrays.toString(arr));
        System.out.println((double) System.currentTimeMillis() - executionTime);
    }

    public static void createArray(double[] arr) {
        long executionTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println((double) System.currentTimeMillis() - executionTime);
    }

    @Override
    public void run() {
    }
}
