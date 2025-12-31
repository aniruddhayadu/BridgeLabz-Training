package com.objectmodeling.self;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    // Association: add student to course
    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}
