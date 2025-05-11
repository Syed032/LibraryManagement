package com.librarymanagement;

public class Student {
    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor
    public Student(int studentId, String name, String course, int year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    
	// Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    // Display method
    public void displayStudent() 
    {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Course: " + course + ", Year: " + year);
    }
}
