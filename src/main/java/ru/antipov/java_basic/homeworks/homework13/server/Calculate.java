package ru.antipov.java_basic.homeworks.homework13.server;

public interface Calculate {

    default double sum(double a, double b){
        return a + b;
    }

    default double diff(double a, double b){
        return a - b;
    }

    default double prod(double a, double b){
        return a * b;
    }

    default double quot(double a, double b){
        return a / b;
    }


}
