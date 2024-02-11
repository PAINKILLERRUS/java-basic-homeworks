package ru.antipov.java_basic.homeworks.homework5;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;
    protected int wasteOfStamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina, int wasteOfStamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.wasteOfStamina = wasteOfStamina;
    }

    public int run(int distance) {
        int wasteOfStamina = 1;
        int staminaForSecond = (runSpeed * wasteOfStamina);
        int seconds = distance / runSpeed;
        int spentOfStamina = seconds * staminaForSecond;
        if ((stamina - spentOfStamina) >= 0) {
            stamina -= spentOfStamina;
            return seconds;
        }
        System.out.println("Животное: " + name + " устало.");
        return -1;
    }

    public int swim(int distance, int wasteOfStamina) {
        int staminaForSecond = (runSpeed * wasteOfStamina);
        int seconds = distance / runSpeed;
        int spentOfStamina = seconds * staminaForSecond;
        if ((stamina - spentOfStamina) >= 0) {
            stamina -= spentOfStamina;
            return seconds;
        }
        System.out.println("Животное: " + name + " устало.");
        return -1;
    }

    public abstract void info();
}
