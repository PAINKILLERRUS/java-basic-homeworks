package ru.antipov.java_basic.homeworks.homework7;

public class Car implements Moving {

    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean movement(int distance, Terrain terrain) {
        int fuelCompsuntion = fuel - distance;
        if (terrain == Terrain.SWAMP || terrain == Terrain.DENSE_FOREST) {
            System.out.println("Машина не может ехать в данной местности.");
            return false;
        }
        if (distance > fuel)
            distance = fuel;
        System.out.println("Машина проехала: " + distance);
        if (fuelCompsuntion <= 0) {
            System.out.println("У машины закончилось топливо.");
            return false;
        } else
            return true;
    }
}
