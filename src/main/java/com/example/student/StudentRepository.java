package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // JpaRepository provides methods like findAll(), save(), findById(), deleteById() automatically
}

