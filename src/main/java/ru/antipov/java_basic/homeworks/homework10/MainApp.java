package ru.antipov.java_basic.homeworks.homework10;
//
import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add(new User("Ivan","Antipov"),new PhoneNumber("89993456789"));
        phoneBook.add(new User("Oleg","Egorov"),new PhoneNumber("89993456780"));
        phoneBook.add(new User("Elena","Zvereva"),new PhoneNumber("89993456234"));
        phoneBook.find("Elena");
        phoneBook.containsPhoneNumber(new PhoneNumber("89993456780"));
    }
}
