package ru.antipov.java_basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

    public static List<Integer> createRangeList(final int min, final int max, final int step) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i += step) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int sumIntegerMore5(final List<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            if (value > 5) {
                sum += value;
            }
        }
        return sum;
    }

    public static List<Integer> rewriteList(final int a, final List<Integer> list) {
        Collections.fill(list, a);
        return list;
    }

    public static List<Integer> increaseList(final int a, final List<Integer> list) {
        list.replaceAll(integer -> integer + a);
        return list;
    }
}
