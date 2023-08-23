package com.demo.medicaltourismapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MedicalTourismAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalTourismAppApplication.class, args);
    }

}
