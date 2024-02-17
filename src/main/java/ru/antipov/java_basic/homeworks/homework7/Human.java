package ru.antipov.java_basic.homeworks.homework7;

public class Human {
    private String name;
    private Moving currentTransport;

    public Human(String name, Moving currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public boolean movement(int distance, Terrain terrain) {
        if (currentTransport != null) {
            return currentTransport.movement(distance, terrain);
        } else
            System.out.println("Человек прошел пешком: " + distance);
        return true;
    }

    public void setCurrentTransport(Moving currentTransport) {
        this.currentTransport = currentTransport;
    }
}
