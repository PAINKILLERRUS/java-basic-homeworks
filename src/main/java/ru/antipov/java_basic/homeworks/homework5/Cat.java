package ru.antipov.java_basic.homeworks.homework5;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int swimSpeed, int stamina, int wasteOfStamina) {
        super(name, runSpeed, swimSpeed, stamina, wasteOfStamina);
    }

    @Override
    public int swim(int distance, int wasteOfStamina) {
        System.out.println("Кот плавать не умеет!");
        return -1;
    }

    @Override
    public void info() {
        System.out.println("Кот: " + name + "\n"
                + "Скорость бега: " + runSpeed + "\n"
                + "Скорость плавания: " + swimSpeed + "\n"
                + "Выносливость: " + stamina);
    }
}
