/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.codesoom.demo;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        try {
            InetSocketAddress address = new InetSocketAddress(8000);
            HttpServer httpServer = HttpServer.create(address, 0);
            httpServer.createContext("/", new DemoHttpHandler());
            httpServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
