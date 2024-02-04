package ru.antipov.java_basic.homeworks.homework4;

public class Box {

    public static void main(String[] args) {
        Box box = new Box(4, 4, "Белый");
        box.boxInfo();
        box.changeColour("Черный");
        box.boxInfo();
        box.openBox();
        box.takeItOutOfTheBox("Orange");
        box.putInTheBox("Apple");
        box.putInTheBox("Pen");
        box.takeItOutOfTheBox("Apple");
        box.closeBox();
    }

    private int width;
    private int height;
    private String colour;

    private static int isEmpty = 0;
    private static boolean boxAction = true;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public Box(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void openBox() {
        if (boxAction)
            boxAction = false;
        System.out.println("Открываем коробку.");
    }

    public void closeBox() {
        if (!boxAction) {
            System.out.println("Закрываем коробку.");
        } else System.out.println("Коробка уже закрыта.");
    }

    public void changeColour(String s) {
        colour = s;
        System.out.println("Новый цвет коробки: " + s);
    }

    public void boxInfo() {
        System.out.println("Коробка " + colour + " цвет\n"
                + "Размер: высота= " + width + " длина= " + height);
    }

    public void putInTheBox(String str) {
        if (isEmpty == 0) {
            System.out.println("В коробку положили: " + str);
            isEmpty++;
        } else System.out.println("Коробка заполнена");
    }

    public void takeItOutOfTheBox(String str) {
        if (isEmpty != 0) {
            System.out.println("Из коробки взяли: " + str);
        } else System.out.println("Коробка пуста.");
    }
}
