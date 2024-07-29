package ru.antipov.java.basic.homeworks.homework23.processors;

import ru.antipov.java.basic.homeworks.homework23.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class AnotherHelloWorldProcessor implements RequestProcessor {
    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        String response = """
                 HTTP/1.1 200 OK\r
                Content-Type: text/html\r
                \r
                <html><body><h1>Another Hello World!<h1><body><html>""";
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
