package com.skillforge;

import java.util.List;

class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public AdvancedCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    protected void printCertificateFormat() {
        System.out.println("Advanced Level Certificate with Honors");
    }
}
