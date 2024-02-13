package ru.antipov.java_basic.homeworks.homework6;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(250, 300);
        plate.plateInfo();
        Cat[] cats = {new Cat("Myrzik", 100), new Cat("Barsik", 100), new Cat("Tom", 100)};
        for (Cat catDinner : cats) {
            catDinner.catEat(plate);
            plate.plateInfo();
        }
    }
}
