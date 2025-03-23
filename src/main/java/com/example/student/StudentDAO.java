package com.example.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Alice");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Bob");
        s2.setAge(22);

        students.add(s1);
        students.add(s2);

        return students;
    }
}
