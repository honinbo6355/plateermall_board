package com.plateer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BoardBootApplication {
    public static void main(String[] args) {

//        System.out.println("Hello World !!");
        SpringApplication.run(BoardBootApplication.class, args);
        log.error("hello");
    }
}
