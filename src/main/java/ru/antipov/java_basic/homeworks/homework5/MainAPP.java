package ru.antipov.java_basic.homeworks.homework5;

public class MainAPP {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 10, 0, 30,0);
        Dog dog = new Dog("Zybok", 15, 5, 50,2);
        Horse horse = new Horse("Angel", 40, 7, 100,4);
        cat.info();
        dog.info();
        horse.info();
        cat.run(45);
        cat.info();
        cat.swim(20,0);
        dog.run(55);
        dog.info();
        horse.swim(20,4);
        horse.info();
    }
}
