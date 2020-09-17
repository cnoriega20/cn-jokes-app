package com.springboot.cnjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-config.xml")
public class CnJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnJokesAppApplication.class, args);
    }

}
