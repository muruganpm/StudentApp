<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Student App</title>
</head>
<body>
    <h1>Student List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        <%
            // Retrieve the list of students set by the StudentServlet
            java.util.List<com.example.student.Student> students =
                (java.util.List<com.example.student.Student>) request.getAttribute("students");
            if (students != null && !students.isEmpty()) {
                for (com.example.student.Student student : students) {
        %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getAge() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="3">No students found.</td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <a href="form.jsp">Add New Student</a>
</body>
</html>
