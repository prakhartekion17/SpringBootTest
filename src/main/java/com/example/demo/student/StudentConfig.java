package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student Jumbo=new Student(
                    "Jumbo",
                    "Jumbo@king.com",
                    LocalDate.of(2000, MARCH,17)

            );
            Student Jack=new Student(
                    "Jack",
                    "Jack@king.com",
                    LocalDate.of(2003, MARCH,17)

            );
            repository.saveAll( //Inserting into the database
                    List.of(Jumbo,Jack)
            );

        };
    }
}
