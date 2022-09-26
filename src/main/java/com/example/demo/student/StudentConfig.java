package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student george = new Student(
                    "George",
                    "georgedaoutis93@gmail.com",
                    LocalDate.of(1993, Month.SEPTEMBER, 14)
            );
            Student konna = new Student(
                    "Konna",
                    "konnakorda@gmail.com",
                    LocalDate.of(1993, Month.NOVEMBER, 9)
            );

            repository.saveAll(List.of(george,konna));
        };
    }
}
