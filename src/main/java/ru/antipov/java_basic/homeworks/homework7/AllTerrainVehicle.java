package ru.antipov.java_basic.homeworks.homework7;

public class AllTerrainVehicle implements Moving {

    private int fuel;

    public AllTerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean movement(int distance, Terrain terrain) {
        int fuelCompsuntion = fuel - distance;
        if (distance > fuel)
            distance = fuel;
        System.out.println("Вездеход проехал: " + distance);
        if (fuelCompsuntion <= 0) {
            System.out.println("У вездехода закончилось топливо.");
            return false;
        } else
            return true;
    }
}
