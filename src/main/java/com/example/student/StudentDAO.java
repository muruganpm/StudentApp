package com.example.student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {

    private final JdbcTemplate jdbcTemplate;

    public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Student(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));
    }

    public Student getStudentById(Long id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Student(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));
    }

    public void createStudent(Student student) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail());
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getId());
    }

    public void deleteStudent(Long id) {
        String sql = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
