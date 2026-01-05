package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements ICourseActions {

    private List<Integer> grades; // private as required
    private List<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    
    public double calculateGPA() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return grades.size() == 0 ? 0 : (double) total / grades.size();
    }


    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }


    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
