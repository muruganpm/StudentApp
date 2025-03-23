package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentDAO.getStudentById(id);  // Changed from int to Long
    }

    // Create a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentDAO.createStudent(student);
    }

    // Update an existing student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);  // Ensure the ID is set
        return studentDAO.updateStudent(student);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentDAO.deleteStudent(id);  // Changed from int to Long
    }
}
