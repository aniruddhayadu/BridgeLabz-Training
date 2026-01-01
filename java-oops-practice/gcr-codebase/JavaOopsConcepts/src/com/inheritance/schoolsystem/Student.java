package com.inheritance.schoolsystem;

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        displayPersonInfo();
        System.out.println("Grade: " + grade);
    }
}
