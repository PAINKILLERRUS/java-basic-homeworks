package ru.antipov.java_basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        var list = ListMethods.createRangeList(5, 10, 1);
        System.out.println("Диапозон листа: " + list);
        var sum = ListMethods.sumIntegerMore5(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Сумма аргументов списка больше 5: " + sum);
        var list2 = ListMethods.rewriteList(5, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("Перезаписанные значения списка: " + list2);
        var list3 = ListMethods.increaseList(5, new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2)));
        System.out.println("Лист после увеличения значений: " + list3);


        EmployeeMethods.employeeNameList(new ArrayList<>(Arrays.asList(
                new Employee("Ivan", 24), new Employee("Liza", 25),
                new Employee("Egor", 22), new Employee("Viktor", 30),
                new Employee("Elena", 19), new Employee("Marat", 21))));
        System.out.println("------------------------------");

        EmployeeMethods.employeeAgeList(new ArrayList<>(Arrays.asList(
                new Employee("Ivan", 24), new Employee("Liza", 25),
                new Employee("Egor", 22), new Employee("Viktor", 30),
                new Employee("Elena", 19), new Employee("Marat", 21))), 23);
        System.out.println("------------------------------");

        EmployeeMethods.empAerageAgeList(new ArrayList<>(Arrays.asList(
                new Employee("Ivan", 24), new Employee("Liza", 25),
                new Employee("Egor", 22), new Employee("Viktor", 30),
                new Employee("Elena", 19), new Employee("Marat", 21))), 25);
        System.out.println("------------------------------");

        EmployeeMethods.empYoungList(new ArrayList<>(Arrays.asList(
                new Employee("Ivan", 24), new Employee("Liza", 25),
                new Employee("Egor", 22), new Employee("Viktor", 30),
                new Employee("Elena", 19), new Employee("Marat", 21))));
    }
}
