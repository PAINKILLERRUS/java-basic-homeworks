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
        float threshold = 0.0001F;
        return Math.abs(this.getWeight() - another.getWeight()) < threshold;
    }

    public void shift(Box<T> another) {
        if (another.list.isEmpty()) {
            System.out.println("Коробка пуста");
            return;
        } else if (another.list.equals(this.list)) {
            System.out.println("Одинаковое содержимое коробок");
            return;
        } else {
            list.addAll(another.list);
        }
        another.list.clear();
    }
}
