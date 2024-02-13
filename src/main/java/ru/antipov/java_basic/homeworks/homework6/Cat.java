package ru.antipov.java_basic.homeworks.homework6;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void catEat(Plate plate) {
        if (satiety || plate.amountOfFood >= appetite) {
            plate.decreaseFood(100);
            satiety = true;
            System.out.println("Кот: " + name + " поел. Кот сыт.");
        } else {
            System.out.println("Коту: " + name + " не хватило еды, кот голоден.");
        }
    }
}
