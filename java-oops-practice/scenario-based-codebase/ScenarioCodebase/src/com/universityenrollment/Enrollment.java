package com.universityenrollment;

public class Enrollment implements Graded {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Polymorphism: Different grading styles
    @Override
    public void assignGrade(String grade) {
        this.grade = grade;

        double gradePoints = 0;

        // Letter grading
        switch (grade) {
            case "A": gradePoints = 4.0; break;
            case "B": gradePoints = 3.0; break;
            case "C": gradePoints = 2.0; break;
            case "D": gradePoints = 1.0; break;
            case "F": gradePoints = 0.0; break;
        }

        student.updateGPA(gradePoints, course.getCredits());
    }
}
