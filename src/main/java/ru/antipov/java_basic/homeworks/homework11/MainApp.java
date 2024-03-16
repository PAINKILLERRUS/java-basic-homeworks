package ru.antipov.java_basic.homeworks.homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,6,9,20,30,11,14,35,7,5,21,10));

        Tree<Integer> tree = new Tree<>(list);

        tree.getSortedList().forEach(System.out::println);

        System.out.println(tree.find(11));
        System.out.println(tree.find(0));

    }
}
