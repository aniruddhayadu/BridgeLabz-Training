package com.objectmodeling.self;

public class UMSMain {
    public static void main(String[] args) {

        // Professors
        UMSProfessor prof1 = new UMSProfessor("Dr. Sharma");
        UMSProfessor prof2 = new UMSProfessor("Prof. Mehta");

        // Courses
        UMSCourse c1 = new UMSCourse("Mathematics");
        UMSCourse c2 = new UMSCourse("Physics");

        // Assign professors
        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        // Students
        UMSStudent s1 = new UMSStudent("Alice");
        UMSStudent s2 = new UMSStudent("Bob");

        // Enroll students
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        // Display details
        c1.displayCourse();
        System.out.println();
        c2.displayCourse();
        System.out.println();
        s1.viewCourses();
        System.out.println();
        prof1.viewCourses();
    }
}
