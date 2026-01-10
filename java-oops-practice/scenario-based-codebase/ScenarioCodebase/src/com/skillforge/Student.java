package com.skillforge;

import java.util.*;

class Student extends User implements ICertifiable {

    private Map<Course, Double> progress = new HashMap<>();
    private int score;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules, Course course) {
        double percentage = (completedModules * 100.0) / totalModules;
        progress.put(course, percentage);
    }

    public double getProgress(Course course) {
        return progress.getOrDefault(course, 0.0);
    }

    public void assignScore(int score) {
        this.score = score;
    }

    public void generateCertificate(Course course) {
        if (score >= 50 && getProgress(course) == 100.0) {
            System.out.println("\nCertificate Generated for " + name);
            System.out.println("Course: " + course.getTitle());
            course.printCertificateFormat();
        } else {
            System.out.println("Not eligible for certificate");
        }
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }
}
