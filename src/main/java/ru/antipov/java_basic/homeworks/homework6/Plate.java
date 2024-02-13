package ru.antipov.java_basic.homeworks.homework6;

public class Plate {
    protected int amountOfFood;
    protected final int maxAmountFood;

    public Plate(int amountOfFood, int maxAmountFood) {
        this.amountOfFood = amountOfFood;
        this.maxAmountFood = maxAmountFood;
    }

    public void addFood(int food) {
        amountOfFood += food;
        if (amountOfFood >= maxAmountFood) {
            amountOfFood = maxAmountFood;
            System.out.println("Тарелка полностью заполнена");
        } else
            System.out.println("В тарелку добавили: " + food + " еды.");
    }

    public boolean decreaseFood(int amount) {
        amountOfFood -= amount;
        if (amountOfFood >= 0)
            return true;
        amountOfFood = 0;
            return false;
    }

    public void plateInfo() {
        System.out.println("В тарелке " + amountOfFood + " еды.");
    }
}
