package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String regNo;
    private String fullName;
    private String email;
    private LocalDate dateCreated;
    private List<String> enrolledCourses = new ArrayList<>();

    public Student(String id, String regNo, String fullName, String email, LocalDate dateCreated) {
        this.id = id;
        this.regNo = regNo;
        this.fullName = fullName;
        this.email = email;
        this.dateCreated = dateCreated;
    }

    public String getId() { return id; }
    public String getRegNo() { return regNo; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public LocalDate getDateCreated() { return dateCreated; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }

    public void printProfile() {
        System.out.println("Student Registration No: " + regNo);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Enrolled Courses: " + enrolledCourses);
        System.out.println("------------------------");
    }
}
