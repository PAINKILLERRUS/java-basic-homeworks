package ru.antipov.java_basic.homeworks.homework10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<User, PhoneNumber> phoneBook;

    public PhoneBook(Map<User, PhoneNumber> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public boolean containsPhoneNumber(final PhoneNumber phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    public void add(final User user, final PhoneNumber phoneNumber) {
        phoneBook.put(user, phoneNumber);
    }

    public Set<PhoneNumber> find(final String name) {
        Set<PhoneNumber> phoneNumbers = new HashSet<>();
        for (User user : phoneBook.keySet()) {
            if (user.getName().equals(name)) {
                PhoneNumber phoneNumber = phoneBook.get(user);
                phoneNumbers.add(phoneNumber);
            }
        }
        System.out.println(phoneNumbers);
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
