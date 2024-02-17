package ru.antipov.java_basic.homeworks.homework7;

public class Bike implements Moving {
    @Override
    public boolean movement(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может проехать в данной местности.");
            return false;
        }
        System.out.println("Человек на елосипеде проехл: " + distance);
        return true;
    }
}
