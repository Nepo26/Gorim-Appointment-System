package com.gorim.simpleappointmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SimpleAppointmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppointmentSystemApplication.class, args);
    }

}
