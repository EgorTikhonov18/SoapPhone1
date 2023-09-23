package com.example.amigogdemo.config;

import com.example.amigogdemo.model.Student;
import com.example.amigogdemo.repo.StudentRepository;
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
           Student bob = new Student(
                   "BOB",
                   LocalDate.of(2001, Month.APRIL, 5),
                   "gg@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2004, Month.APRIL, 5),
                    "alexg@gmail.com"
            );
            repository.saveAll(List.of(bob, alex)
            );
        };
    }
}
