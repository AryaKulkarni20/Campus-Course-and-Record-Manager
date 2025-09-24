package edu.ccrm.domain;

import edu.ccrm.util.Semester;

public class Course {
    private String code;
    private String title;
    private int credits;
    private String instructor;
    private Semester semester;
    private String department;

    public Course(String code, String title, int credits, String instructor, Semester semester, String department) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.department = department;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public String getInstructor() { return instructor; }
    public Semester getSemester() { return semester; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + " credits), Instructor: " + instructor +
                ", Semester: " + semester + ", Department: " + department;
    }
}
