package ru.antipov.java_basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina, int wasteOfStamina) {
        super(name, runSpeed, swimSpeed, stamina, wasteOfStamina);
    }

    @Override
    public void info() {
        System.out.println("Cобака: " + name + "\n"
                + "Скорость бега: " + runSpeed + "\n"
                + "Скорость плавания: " + swimSpeed + "\n"
                + "Выносливость: " + stamina);
    }
}
