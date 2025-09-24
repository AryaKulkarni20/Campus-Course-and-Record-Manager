package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.*;

public class StudentService {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getRegNo(), student);
    }

    public List<Student> listStudents() {
        return new ArrayList<>(students.values());
    }

    public Student findByRegNo(String regNo) {
        return students.get(regNo);
    }
}

