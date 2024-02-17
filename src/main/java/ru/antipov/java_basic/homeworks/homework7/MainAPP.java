package ru.antipov.java_basic.homeworks.homework7;

public class MainAPP {
    public static void main(String[] args) {
        Human human = new Human("Ivan", new Horse(100));
        Human human2 = new Human("Alex", new Car(200));
        System.out.println(human.movement(110, Terrain.DENSE_FOREST));
        System.out.println(human2.movement(150, Terrain.SWAMP));
        human2.setCurrentTransport(new AllTerrainVehicle(300));
        System.out.println(human2.movement(400, Terrain.SWAMP));
        human.setCurrentTransport(new Bike());
        System.out.println(human.movement(150, Terrain.SWAMP));
    }
}
