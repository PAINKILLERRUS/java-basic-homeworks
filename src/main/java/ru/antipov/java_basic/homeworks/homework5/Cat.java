package ru.antipov.java_basic.homeworks.homework5;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public int swim(int distance) {
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

    @Override
    public int run(int distance) {
        return super.run(distance);
    }
}
