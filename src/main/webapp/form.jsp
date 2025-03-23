<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h1>Add New Student</h1>
    <!-- The form submits to the same URL pattern handled by StudentServlet -->
    <form action="students" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br><br>
        <input type="submit" value="Add Student">
    </form>
    <br>
    <a href="index.jsp">Back to Student List</a>
</body>
</html>
