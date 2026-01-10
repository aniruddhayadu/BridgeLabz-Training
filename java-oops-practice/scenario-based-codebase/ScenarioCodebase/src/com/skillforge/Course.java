package com.skillforge;

import java.util.*;

class Course {

    private String title;
    private Instructor instructor;

    // Encapsulated rating logic
    protected double rating;

    private List<String> modules;

    // Internal reviews (read-only)
    private List<String> internalReviews = new ArrayList<>();

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        modules.add("Introduction");
        modules.add("Basics");
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void updateRating(double newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = newRating;
        }
    }

    public int getTotalModules() {
        return modules.size();
    }

    public String getTitle() {
        return title;
    }

    public void addReview(String review) {
        internalReviews.add(review);
    }

    public List<String> getInternalReviews() {
        return Collections.unmodifiableList(internalReviews);
    }

    // Polymorphic method
    protected void printCertificateFormat() {
        System.out.println("Standard Course Certificate");
    }
}
