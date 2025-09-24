package edu.ccrm.cli;

import edu.ccrm.domain.*;
import edu.ccrm.service.*;
import edu.ccrm.util.*;
import java.time.LocalDate;
import java.util.Scanner;

public class CCRMConsole {
    private final StudentService studentService = new StudentService();
    private final CourseService courseService = new CourseService();
    private final EnrollmentService enrollmentService = new EnrollmentService();

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\nCCRM Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. Record Grade");
            System.out.println("7. Print Transcript");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> addStudent();
                case "2" -> listStudents();
                case "3" -> addCourse();
                case "4" -> listCourses();
                case "5" -> enrollStudentInCourse();
                case "6" -> recordGrade();
                case "7" -> printTranscript();
                case "0" -> {
                    System.out.println("Exiting... Bye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Registration No: ");
        String regNo = scanner.nextLine();
        Student s = new Student(java.util.UUID.randomUUID().toString(), regNo, fullName, email, LocalDate.now());
        studentService.addStudent(s);
        System.out.println("Student added successfully.");
    }

    private void listStudents() {
        System.out.println("\nStudents List:");
        for (Student s : studentService.listStudents()) {
            s.printProfile();
        }
    }

    private void addCourse() {
        System.out.print("Course Code: ");
        String code = scanner.nextLine();
        System.out.print("Course Title: ");
        String title = scanner.nextLine();
        System.out.print("Credits: ");
        int credits = Integer.parseInt(scanner.nextLine());
        System.out.print("Semester (SPRING, SUMMER, FALL): ");
        Semester semester = Semester.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Instructor: ");
        String instructor = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();

        Course c = new Course(code, title, credits, instructor, semester, department);
        courseService.addCourse(c);
        System.out.println("Course added successfully.");
    }

    private void listCourses() {
        System.out.println("\nCourses List:");
        for (Course c : courseService.listCourses()) {
            System.out.println(c);
        }
    }

    private void enrollStudentInCourse() {
        System.out.print("Student Registration No: ");
        String regNo = scanner.nextLine();
        Student s = studentService.findByRegNo(regNo);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();
        Course c = courseService.findByCode(courseCode);
        if (c == null) {
            System.out.println("Course not found.");
            return;
        }
        enrollmentService.enroll(s, c);
        System.out.println("Enrollment successful.");
    }

    private void recordGrade() {
        System.out.print("Student Registration No: ");
        String regNo = scanner.nextLine();
        Student s = studentService.findByRegNo(regNo);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();
        Course c = courseService.findByCode(courseCode);
        if (c == null) {
            System.out.println("Course not found.");
            return;
        }
        System.out.print("Grade (S, A, B, C, D, E, F): ");
        Grade grade;
        try {
            grade = Grade.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade entered.");
            return;
        }
        enrollmentService.recordGrade(s, c, grade);
        System.out.println("Grade recorded successfully.");
    }

    private void printTranscript() {
        System.out.print("Student Registration No: ");
        String regNo = scanner.nextLine();
        Student s = studentService.findByRegNo(regNo);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        enrollmentService.printTranscript(s);
    }
}
