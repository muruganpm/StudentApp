package com.example.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, int age) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
