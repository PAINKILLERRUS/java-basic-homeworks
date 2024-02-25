package ru.antipov.java_basic.homeworks.homework9;

import java.util.*;

public class EmployeeMethods {

    public static List<Employee> employeeNameList(final List<Employee> list) {
        for (Employee emp : list) {
            System.out.println(emp.getName());
        }
        return list;
    }

    public static List<Employee> employeeAgeList(final List<Employee> list, final int minAge) {
        for (Employee emp : list) {
            if (emp.age <= minAge) {
                System.out.println(emp);
            }
        }
        return list;
    }

    public static List<Employee> empAerageAgeList(final List<Employee> list, final int averageAge) {
        int sumAvgAge = 0;
        for (Employee emp : list) {
            sumAvgAge += emp.age / list.size();
        }
        if (sumAvgAge > averageAge)
            System.out.println("Средний возраст сотрудников: " + sumAvgAge +
                    " превышает указанный возраст: " + averageAge);
        else System.out.println("Средний возраст сотрудников: " + sumAvgAge +
                " меньше указанного возраста: " + averageAge);
        return list;
    }

    public static List<Employee> empYoungList(final List<Employee> list) {
        Employee min = list.stream().
                min(Comparator.comparing(Employee::getAge)).
                orElseThrow(NoSuchElementException::new);
        System.out.println(min);
        return list;
    }

    /**
     * В последнем методе использовал STREAM API для нахождения самого молодого сотрудника
     */
}
