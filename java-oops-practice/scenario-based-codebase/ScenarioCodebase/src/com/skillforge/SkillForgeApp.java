package com.skillforge;

import java.util.Arrays;

public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Dr. Sharma", "sharma@skillforge.com");
        Student student = new Student("Arif", "arif@student.com");

        Course javaCourse = new BeginnerCourse(
                "Java Programming",
                instructor,
                Arrays.asList("OOP", "Collections", "Streams")
        );

        // Progress tracking using operators
        student.updateProgress(3, javaCourse.getTotalModules(), javaCourse);

        // Grading
        student.assignScore(85);

        // Certificate generation (polymorphism)
        student.generateCertificate(javaCourse);

        // Internal reviews (read-only)
        javaCourse.addReview("Excellent content");
        System.out.println("\nInternal Reviews:");
        System.out.println(javaCourse.getInternalReviews());
    }
}
