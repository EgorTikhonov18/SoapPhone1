package com.example.soapPhone.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Person {
    String initials;
    List<String> phone;
    LocalDate DateOfBirth;
    Long id;
    //List<Person> contacts;


}
