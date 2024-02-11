package ru.antipov.java_basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina, int wasteOfStamina) {
        super(name, runSpeed, swimSpeed, stamina, wasteOfStamina);
    }

    @Override
    public void info() {
        System.out.println("Лошадь: " + name + "\n"
                + "Скорость бега: " + runSpeed + "\n"
                + "Скорость плавания: " + swimSpeed + "\n"
                + "Выносливость: " + stamina);
    }
}
