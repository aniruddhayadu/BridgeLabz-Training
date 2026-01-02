package com.universityenrollment;

public class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Enrollment enrollment, String grade) {
        enrollment.assignGrade(grade);
        System.out.println("Grade assigned by " + facultyName);
    }
}
