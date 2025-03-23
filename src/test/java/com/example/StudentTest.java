package com.example;

import com.example.student.Student;
import com.example.student.StudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentDAO studentDAO;

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setName("John Doe");
        student.setEmail("john.doe@example.com");
    }

    @Test
    public void testCreateStudent() {
        studentDAO.createStudent(student);
        Student savedStudent = studentDAO.getStudentById(student.getId());
        assertNotNull(savedStudent);
        assertEquals("John Doe", savedStudent.getName());
    }

    @Test
    public void testUpdateStudent() {
        student.setName("John Updated");
        studentDAO.updateStudent(student);
        Student updatedStudent = studentDAO.getStudentById(student.getId());
        assertEquals("John Updated", updatedStudent.getName());
    }

    @Test
    public void testDeleteStudent() {
        studentDAO.deleteStudent(student.getId());
        assertNull(studentDAO.getStudentById(student.getId()));
    }
}
