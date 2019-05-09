package com.example.generatename;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GenerateNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerateNameApplication.class, args);

    }

}
