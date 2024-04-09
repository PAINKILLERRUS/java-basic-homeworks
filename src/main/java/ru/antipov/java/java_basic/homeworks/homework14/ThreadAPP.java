package ru.antipov.java.java_basic.homeworks.homework14;

/**
 * Задал количество элементов в массиве при его создании равное 1_000_000.
 * При попытке создания массива в 100_000_000 выпадает ошибка о недотстатке памяти, слабое железо
 */

public class ThreadAPP {

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[4];
        double[] result = new double[1_000_000];
        for (int i = 0; i < threads.length; i++) {
            threads[0] = new Thread(() -> fillDoubleArray(result, 0, 250_000));
            threads[1] = new Thread(() -> fillDoubleArray(result, 250_000, 500_000));
            threads[2] = new Thread(() -> fillDoubleArray(result, 500_000, 750_000));
            threads[3] = new Thread(() -> fillDoubleArray(result, 750_000, 1_000_000));
        }
        long executionTime = System.currentTimeMillis();
        threads[0].start();
        threads[1].start();
        threads[2].start();
        threads[3].start();
        threads[0].join();
        threads[1].join();
        threads[2].join();
        threads[3].join();
        System.out.println((double) System.currentTimeMillis() - executionTime);

        createArray(new double[1_000_000]);
    }

    public static void fillDoubleArray(double[] result, int start, int end) {
        for (int i = start; i < end; i++) {
            result[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void createArray(double[] arr) {
        long executionTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println((double) System.currentTimeMillis() - executionTime);
    }
}
