package ru.antipov.java_basic.homeworks.homework5;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        int seconds = distance / runSpeed;
        int spentOfStamina = seconds * staminaForSecond(runSpeed, 1);
        if ((stamina - spentOfStamina) >= 0) {
            stamina -= spentOfStamina;
            return seconds;
        }
        System.out.println("Животное: " + name + " устало.");
        return -1;
    }

    public abstract int swim(int distance);

    public abstract void info();

    protected int staminaForSecond(int speed, int wasteOfStamina) {
        return speed * wasteOfStamina;
    }

}
