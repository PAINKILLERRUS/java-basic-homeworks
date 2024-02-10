package ru.antipov.java_basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public int swim(int distance) {
        int seconds = distance / runSpeed;
        int spentOfStamina = seconds * staminaForSecond(runSpeed, 4);
        if ((stamina - spentOfStamina) >= 0) {
            stamina -= spentOfStamina;
            return seconds;
        }
        System.out.println("Лошадь: " + name + " устала.");
        return -1;
    }

    @Override
    public void info() {
        System.out.println("Лошадь: " + name + "\n"
                + "Скорость бега: " + runSpeed + "\n"
                + "Скорость плавания: " + swimSpeed + "\n"
                + "Выносливость: " + stamina);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    protected int staminaForSecond(int speed, int wasteOfStamina) {
        return super.staminaForSecond(speed, wasteOfStamina);
    }
}
