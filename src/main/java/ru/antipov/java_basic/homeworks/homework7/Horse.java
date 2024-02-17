package ru.antipov.java_basic.homeworks.homework7;

public class Horse implements Moving {

    private int horsePower;

    public Horse(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean movement(int distance, Terrain terrain) {
        int costPower = horsePower - distance;
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может идти в данной местности.");
            return false;
        }
        if (distance > horsePower)
            distance = horsePower;
        System.out.println("Лошадь прошла: " + distance);
        if (costPower <= 0) {
            System.out.println("У лошади закончились силы.");
            return false;
        } else
            return true;
    }
}
