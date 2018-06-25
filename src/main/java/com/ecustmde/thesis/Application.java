package com.ecustmde.thesis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * core app
 */
@SpringBootApplication
//@ComponentScan(basePackages = "com.ecustmde.thesis")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
