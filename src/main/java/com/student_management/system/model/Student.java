package com.student_management.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max = 50, message = "First name cannot exceed 50 characters")
    private String first_name;

    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    private String last_name;


    private LocalDate birthday;

    @Size(max = 15, message ="Phone number cannot exceed 15 characters")
    private String phoneNumber;


    private String address;
    private String degree_name;
    private String email;




}
