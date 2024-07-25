package ru.antipov.java.basic.homeworks.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class FindSymbolsClass {

    public static void main(String[] args) throws IOException {
        FindSymbolsClass findSymbolsClass = new FindSymbolsClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String filename = scanner.next();
        System.out.println("Введите последовательность символов:");
        String symbols = scanner.next();
        findSymbolsClass.countingByCharactersOfASequence(symbols, new File(filename));
    }

    public int countingByCharactersOfASequence(String symbols, File file) {
        int numberOfCoincidences = 0;
        if (file.getName().equals("Text.txt")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    if (!(line.contains(symbols))) {
                        System.out.println("Совпадений не найдено");
                        break;
                    } else {
                        while (line.contains(symbols)) {
                            int index = line.indexOf(symbols);
                            line = line.substring(index + symbols.length());
                            numberOfCoincidences++;
                        }
                    }
                }
                System.out.println("Количество совпадений искомой последовательности символов - " + symbols + " равна: " + numberOfCoincidences);
                return numberOfCoincidences;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Неверное имя файла");
        }
        return 0;
    }
}
