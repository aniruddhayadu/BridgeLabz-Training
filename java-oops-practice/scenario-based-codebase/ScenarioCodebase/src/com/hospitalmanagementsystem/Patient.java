package com.hospitalmanagementsystem;

class Patient {
    protected int patientId;
    protected String name;
    protected int age;
    private String medicalHistory;

    // Emergency admission (minimum details)
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Normal admission (full details)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this(patientId, name, age);
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
