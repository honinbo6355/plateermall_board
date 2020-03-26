package com.plateer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class BoardBootApplication {
    public static void main(String[] args) {

        SpringApplication.run(BoardBootApplication.class, args);
        log.error("plateer mall starting...");
    }
}
