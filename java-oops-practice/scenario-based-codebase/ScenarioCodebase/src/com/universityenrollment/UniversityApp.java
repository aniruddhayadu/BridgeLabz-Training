package com.universityenrollment;

public class UniversityApp {
    public static void main(String[] args) {

        Student ugStudent = new Undergraduate("S101", "Anjali");
        Student pgStudent = new Postgraduate("S201", "Rohit");

        Course java = new Course("CS101", "Java Programming", 4);

        Enrollment e1 = new Enrollment(ugStudent, java);
        Enrollment e2 = new Enrollment(pgStudent, java);

        Faculty faculty = new Faculty("Dr. Sharma");

        faculty.gradeStudent(e1, "A");
        faculty.gradeStudent(e2, "B");

        ugStudent.viewTranscript();
        pgStudent.viewTranscript();
    }
}
