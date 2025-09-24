package edu.ccrm.service;

import edu.ccrm.domain.*;
import edu.ccrm.util.Grade;
import java.util.*;

public class EnrollmentService {
    private Map<Student, Map<Course, Grade>> enrollments = new HashMap<>();

    public void enroll(Student s, Course c) {
        enrollments.computeIfAbsent(s, k -> new HashMap<>()).put(c, null);
        s.getEnrolledCourses().add(c.getCode());
    }

    public void recordGrade(Student s, Course c, Grade grade) {
        Map<Course, Grade> grades = enrollments.get(s);
        if (grades != null) {
            grades.put(c, grade);
        }
    }

    public void printTranscript(Student s) {
        Map<Course, Grade> grades = enrollments.get(s);
        if (grades == null || grades.isEmpty()) {
            System.out.println("No grades recorded for " + s.getFullName());
            return;
        }
        System.out.println("Transcript for " + s.getFullName() + ":");
        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            String gradeStr = entry.getValue() == null ? "Not graded" : entry.getValue().name();
            System.out.println(entry.getKey().getCode() + " - " + entry.getKey().getTitle() + ": " + gradeStr);
        }
    }
}
