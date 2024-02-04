package ru.antipov.java_basic.homeworks.homework4;

public class User {

    public static void main(String[] args) {
        User[] users = {new User("Ivan", "Sergeevich", "Antipov", 1994, "ivant@mail.ru"),
                new User("Maksim", "Gennadievich", "Egiriv", 1995, "maks@mail.ru"),
                new User("Elizaveta", "Olegovna", "Nesterova", 1996, "nestLiz@gmail.com"),
                new User("Svetlana", "Igorevna", "Popova", 1980, "popova@mail.ru"),
                new User("Oleg", "Bogdanovich", "Ivachenko", 1970, "ivach@yandex.ru"),
                new User("Zayr", "Maratovich", "Tregylov", 1990, "zTreg@mail.ru"),
                new User("Marat", "Sergeevich", "Udovichenko", 1960, "marat@mail.ru"),
                new User("Aleksandr", "Ivanovich", "Kazennov", 1964, "kazennAl@gmail.com"),
                new User("Evgeni", "Aleksandrovich", "Nilov", 1988, "nilovE@mail.ru"),
                new User("Anton", "Borisovich", "Shyltz", 1982, "aSh@mail.ru"),
        };

        for (User info : users) {
            if (2024 - info.year_or_bright > 40)
                info.userInfo();
        }
    }

    private String name;
    private String surname;

    private String family_name;

    public int year_or_bright;

    private String email;

    public User(String name, String surname, String family_name, int year_or_bright, String email) {
        this.name = name;
        this.surname = surname;
        this.family_name = family_name;
        this.year_or_bright = year_or_bright;
        this.email = email;
    }

    public void userInfo() {
        System.out.println("Ф.И.О : " + family_name + " " + name + " " + surname + "\n" +
                "Год рождения: " + year_or_bright + "\n" +
                "email: " + email);
        System.out.println();
    }
}
