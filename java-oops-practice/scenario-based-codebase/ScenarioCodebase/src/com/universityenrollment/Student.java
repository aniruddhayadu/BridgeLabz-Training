package com.universityenrollment;

public abstract class Student {
    protected String studentId;
    protected String name;

    // GPA is private (Encapsulation)
    private double gpa;
    private int totalCredits;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    protected void updateGPA(double gradePoints, int credits) {
        gpa = ((gpa * totalCredits) + (gradePoints * credits))
                / (totalCredits + credits);
        totalCredits += credits;
    }

    public double getGPA() {
        return gpa;
    }

    // Public method to access transcript
    public void viewTranscript() {
        System.out.println(name + "'s GPA: " + gpa);
    }
}
