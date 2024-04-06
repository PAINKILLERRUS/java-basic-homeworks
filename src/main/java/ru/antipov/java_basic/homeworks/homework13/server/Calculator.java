package ru.antipov.java_basic.homeworks.homework13.server;

public class Calculator implements Calculate {
    @Override
    public double sum(double a, double b) {
        return Calculate.super.sum(a, b);
    }

    @Override
    public double diff(double a, double b) {
        return Calculate.super.diff(a, b);
    }

    @Override
    public double prod(double a, double b) {
        return Calculate.super.prod(a, b);
    }

    @Override
    public double quot(double a, double b) {
        try {
            return Calculate.super.quot(a, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by Zero");
        }
    }
}
