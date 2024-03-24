package ru.antipov.java_basic.homeworks.homework12;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Map<String, Path> files = new HashMap<>();
        File folder = new File("C:\\Documents\\java-basic-homeworks");
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            files.put(file.getName(), file.toPath());
        }
        System.out.println("Содержимое корневой папки: ");
        print(files);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя файла для работы: ");
            String fileName = scanner.nextLine();
            printFile(files.get(fileName).toFile());
            writeFile(files.get(fileName).toFile());
        }
    }

    private static void print(Map<String, Path> files) {
        files.forEach((k, v) -> System.out.println(k + ": " + v));
    }
    private static void printFile(File file) {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile(File file) {
        try (PrintWriter pr = new PrintWriter(new FileOutputStream(file, true));
             Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String str = scanner.nextLine();
                if (str.equals("/exit"))
                    break;
                pr.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
