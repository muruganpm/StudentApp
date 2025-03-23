package com.example.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentDAO {

    private List<Student> students = new ArrayList<>();

    // Dummy data initialization for testing
    public StudentDAO() {
        students.add(new Student(1L, "John Doe", "Computer Science"));
        students.add(new Student(2L, "Jane Doe", "Mathematics"));
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Get student by ID
    public Student getStudentById(Long id) {
        Optional<Student> student = students.stream().filter(s -> s.getId().equals(id)).findFirst();
        return student.orElse(null);  // Return null if student not found
    }

    // Create a new student
    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    // Update an existing student
    public Student updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);  // Replace the existing student
                return student;
            }
        }
        return null;  // Return null if student not found for update
    }

    // Delete a student by ID
    public void deleteStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}
