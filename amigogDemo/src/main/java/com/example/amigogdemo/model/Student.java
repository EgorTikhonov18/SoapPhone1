package com.example.amigogdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1

    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student_sequence")
    private Long id;
    private String name;

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Transient //теперь надо убрать из конструктора это поле и возраст будет считаться сам
    private Integer age;
    private LocalDate dob;
    private String email;


    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }
}

// интересный момент, я пометил поле возраст как transient, ,будет ли аннотация allargsconstructor все еще учитывать это поле