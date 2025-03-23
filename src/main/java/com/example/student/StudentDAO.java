package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {

    @Autowired
    private StudentRepository studentRepository;

    // Fetch all students from the database
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Save a student to the database
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    // Find a student by ID
    public Student findStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
}
