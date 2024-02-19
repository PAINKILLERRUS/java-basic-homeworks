package ru.antipov.java_basic.homeworks.homework8;

import java.util.Arrays;

public class ArraysMethod {

    public static int[][] array(final String[][] arr) throws AppArrayDataException, AppArraySizeException {
        if (arr.length > 4)
            throw new AppArraySizeException();

        int[][] numbers = new int[arr.length][arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    numbers[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
                sum += numbers[i][j];
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(sum);
        return numbers;
    }
}
