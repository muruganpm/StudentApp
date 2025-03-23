package com.example.student;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    private int id;
    private String name;
    private int age;

}
