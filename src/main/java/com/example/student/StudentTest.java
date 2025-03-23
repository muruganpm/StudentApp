package com.example.student;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudent() {
        Student s = new Student();
        s.setName("Alice");
        s.setAge(25);

        assertEquals("Alice", s.getName());
        assertEquals(25, s.getAge());
    }
}
