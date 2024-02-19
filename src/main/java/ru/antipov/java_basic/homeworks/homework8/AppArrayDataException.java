package ru.antipov.java_basic.homeworks.homework8;

public class AppArrayDataException extends Exception{
    private int column;
    private int row;

    public AppArrayDataException(int column, int row){
        super("Некорректный формат преобразования: " + column + " " + row);
        this.column = column;
        this.row = row;
    }
}
