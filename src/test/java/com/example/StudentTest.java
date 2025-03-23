package com.example;

import com.example.student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentProperties() {
        Student student = new Student();
        student.setId(1);
        student.setName("Alice");
        student.setAge(20);

        assertEquals(1, student.getId());
        assertEquals("Alice", student.getName());
        assertEquals(20, student.getAge());
    }
}
