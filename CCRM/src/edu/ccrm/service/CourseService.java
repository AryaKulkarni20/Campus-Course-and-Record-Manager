package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.*;

public class CourseService {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(Course course) {
        courses.put(course.getCode(), course);
    }

    public List<Course> listCourses() {
        return new ArrayList<>(courses.values());
    }

    public Course findByCode(String code) {
        return courses.get(code);
    }
}

