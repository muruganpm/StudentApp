package com.example;

import com.example.student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        // Corrected constructor usage with arguments
        Student student = new Student(1L, "John Doe", "john.doe@example.com");

        // Assert that the values are correctly assigned
        assertEquals(1L, student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals("john.doe@example.com", student.getEmail());
    }

    @Test
    public void testSetAge() {
        Student student = new Student(1L, "John Doe", "john.doe@example.com");
        
        // Corrected method to set and get the age
        student.setAge(21);
        assertEquals(21, student.getAge());
    }
}
