package com.example.student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDAO {

    private final JdbcTemplate jdbcTemplate;

    public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    // Retrieve a student by ID
    public Student getStudentById(Long id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
    }

    // Create a new student
    public void createStudent(Student student) {
        String sql = "INSERT INTO student (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail());
    }

    // Update an existing student
    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getId());
    }

    // Delete a student by ID
    public void deleteStudent(Long id) {
        String sql = "DELETE FROM student WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // Mapper for converting ResultSet to Student object
    private static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            return student;
        }
    }
}
