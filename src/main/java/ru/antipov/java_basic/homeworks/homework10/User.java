package ru.antipov.java_basic.homeworks.homework10;

import java.util.Objects;

public final class User {
    private final String name;
    private final String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surName, user.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public String toString() {
        return "User: " +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
