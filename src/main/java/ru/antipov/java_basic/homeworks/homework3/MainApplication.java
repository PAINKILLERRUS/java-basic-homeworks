package ru.antipov.java_basic.homeworks.homework3;

public class MainApplication {
    public static void main(String[] args) {
        Application.sumOfPositiveElements(new int[][]{{1, -1, 3}, {4, 5, 6}});
        Application.printSquare(4);
        Application.zeroingArray(new int[5][5]);
        Application.findMax(new int[4][4]);
        int sumLine = Application.countLineArray(new int[][]{{2, 2, 2}, {1, 1, 1}});
        System.out.println(sumLine);
    }
}
