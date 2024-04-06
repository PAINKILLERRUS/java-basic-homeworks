package ru.antipov.java_basic.homeworks.homework13.client;

import java.io.*;

public class ExampleClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    /**
  Метод отправки сообщений,реализован в рамках урока
     */
    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
        String result = inputStream.readUTF();
        System.out.println(result);
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
