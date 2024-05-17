package ru.antipov.java.basic.homeworks.homework19;

public class GenericApplication {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();

        System.out.println("Orange: " + orange.getWeight());
        System.out.println("Apple: " + apple.getWeight());

        Box<Orange> box = new Box<>();
        box.put(orange);
        box.put(orange);

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        box1.put(apple);
        box1.put(apple);
        box1.put(apple);

        System.out.println(box.compareBox(box1));
        System.out.println(box.compareBox(box));

        box1.shift(box1);
        box.shift(box);
        box1.shift(box2);
    }
}
