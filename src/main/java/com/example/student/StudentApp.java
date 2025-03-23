package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApp {
    public static void main(String[] args) {
        SpringApplication.run(StudentApp.class, args);

        StudentDAO dao = new StudentDAO();
        System.out.println("Student List:");
        dao.getAllStudents().forEach(System.out::println);
    }
}
