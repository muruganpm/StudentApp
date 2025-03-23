package com.example.student;

public class Student {

    private Long id;  // Ensure ID is Long, not String
    private String name;
    private String major;

    // Constructor
    public Student(Long id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
