# Campus Corse and Record Manager

## Setup
Clone the repository

git clone https://github.com/your-username/CCRM.git

# Navigate to project directory

cd CCRM

# Compile the source code

javac -d out src/edu/ccrm/**/*.java

# Running the Application
From the project directory:

java -cp out edu.ccrm.Main
Or, open the project in an IDE and run the Main class.

# Menu Navigation
You will see the following options:

CCRM Menu:
1. Add Student
2. List Students
3. Add Course
4. List Courses
5. Enroll Student in Course
6. Record Grade
7. Print Transcript
0. Exit
Enter choice:
Enter the number for your desired operation and follow the prompts.

# Features & How To Use
Add Student:
Input name, email, registration number.

List Students:
All students are displayed with details.

Add Course:
Input course code, title, credits, semester, instructor, department.

List Courses:
All courses are displayed.

Enroll Student:
Provide an existing registration number and course code to enroll a student.

Record Grade:
Provide registration number, course code, and grade (S, A, B, C, D, E, F).

Print Transcript:
Show all courses and grades for a student.

Exit:
Choose 0 at any prompt.

# Example Usage
text
Enter choice: 1
Full Name: Jane Doe
Email: jane@example.com
Registration No: REG1001

Enter choice: 3
Course Code: CS101
Title: Computer Science Fundamentals
Credits: 4
Semester: FALL
Instructor: Dr. Smith
Department: CS

Enter choice: 5
Student Registration No: REG1001
Course Code: CS101

Enter choice: 6
Student Registration No: REG1001
Course Code: CS101
Grade: A

Enter choice: 7
Student Registration No: REG1001
-- Transcript displayed --

# Notes
Persistence:
All data is stored in-memory for the session and will be lost when the program closes.

Inputs:
Enum values (semester, grade) are case-insensitive.

Errors:
Program will notify you of invalid choices or when searching for non-existent entries.

Troubleshooting
Ensure you have the correct Java version:
java -version

If you see "No console available", try running from a standard terminal instead of inside some IDEs.

If files do not compile, verify your file paths and project structure.

# Advanced
You may modify or extend the code with extra features (e.g. persistence, GUI, REST API integration).

See the README.md for a full project overview, licensing, and contribution guidelines.

This guide covers setup, usage, features, examples, and troubleshooting for both new and advanced users.Here is a comprehensive USAGE.md file for your CCRM Java console project:

Usage Guide for CCRM (Campus Course & Records Manager)
Introduction
CCRM is a Java console application for managing university campus records. It provides interactive, menu-driven management of students, courses, enrollments, grading, and transcript generation for academic use.

# Prerequisites
Java 17 or later
