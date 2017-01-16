package com.tsystems.ecrono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class EcronoSpringApplication {

    public static void main(String[] args) {
	SpringApplication.run(EcronoSpringApplication.class, args);
    }
}
