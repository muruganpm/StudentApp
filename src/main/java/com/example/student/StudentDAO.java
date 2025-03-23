package com.example.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public List<Student> getStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        String sql = "SELECT * FROM students";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            students.add(s);
        }
        conn.close();
        return students;
    }
}
