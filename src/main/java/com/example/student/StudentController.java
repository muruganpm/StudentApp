package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentDAO.getStudentById(id);
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentDAO.createStudent(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        studentDAO.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentDAO.deleteStudent(id);
    }
}
