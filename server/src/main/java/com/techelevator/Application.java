package com.techelevator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // It signifies that this class is the starting point of the Spring Boot application.
public class Application {

    //This static method call initializes the Spring Application Context, starts the application, and performs classpath scanning, among other bootstrapping tasks.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
