package ru.antipov.java.basic.homeworks.homework23;

import ru.antipov.java.basic.homeworks.homework23.processors.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private Map<String, RequestProcessor> processors;
    private RequestProcessor defaultNotFoundRequestProcessor;
    private RequestProcessor defaultInternalServerErrorRequestProcessor;

    public Dispatcher() {
        this.processors = new HashMap<>();
        this.processors.put("/", new HelloWorldRequestProcessor());
        this.processors.put("/another", new AnotherHelloWorldProcessor());
        this.processors.put("/calculator", new CalculatorRequestProcessor());
        this.defaultNotFoundRequestProcessor = new NotFoundRequestProcessor();
        this.defaultInternalServerErrorRequestProcessor = new DefaultInternalServerErrorRequestProcessor();
    }

    public void execute(HttpRequest request, OutputStream out) throws IOException {
        try {
            if (!processors.containsKey(request.getUri())) {
                defaultNotFoundRequestProcessor.execute(request, out);
                return;
            }
            processors.get(request.getUri()).execute(request, out);
        } catch (BadRequestException e) {
            e.printStackTrace();
            String response = "" +
                    "HTTP/1.1 400 Bad Request\r\n" +
                    "Content-Type: text/html\r\n" +
                    "\r\n" +
                    "<html><body><h1>" + e.getMessage() + "<h1><body><html>";
            out.write(response.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            defaultInternalServerErrorRequestProcessor.execute(request, out);
        }

    }
}
