package com.objectmodeling.self;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    // Association: enroll in a course
    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // many-to-many association
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
