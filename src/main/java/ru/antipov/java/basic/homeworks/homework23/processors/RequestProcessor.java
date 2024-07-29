package ru.antipov.java.basic.homeworks.homework23.processors;

import ru.antipov.java.basic.homeworks.homework23.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;

public interface RequestProcessor {
    void execute(HttpRequest request, OutputStream out) throws IOException;
}
