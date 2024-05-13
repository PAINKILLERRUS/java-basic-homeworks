package ru.antipov.java.basic.homeworks.homework19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list = new ArrayList<>();

    public void put(T fruit) {
        list.add(fruit);
    }

    public float getWeight() {
        float result = 0;

        for (T fruit : list) {
            result += fruit.getWeight();
        }
        return result;
    }

    public boolean compareBox(Box<?> another) {
        if (this.getWeight() == another.getWeight())
            return true;
        else
            return false;
    }

    public void shift(Box<T> another) {
        for (T t : another.list) {
            list.add(t);
        }
        another.list.clear();
    }
}
