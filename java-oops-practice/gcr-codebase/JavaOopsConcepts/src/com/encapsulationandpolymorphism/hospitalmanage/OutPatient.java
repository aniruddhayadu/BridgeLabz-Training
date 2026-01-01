package com.encapsulationandpolymorphism.hospitalmanage;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
    private int consultationFee;
    private int numberOfConsultations;
    private ArrayList<String> records;

    public OutPatient(String patientId, String name, int age, int consultationFee, int numberOfConsultations) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.numberOfConsultations = numberOfConsultations;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee * numberOfConsultations;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String rec : records) {
            System.out.println("- " + rec);
        }
    }

    // Getters and Setters
    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public int getNumberOfConsultations() {
        return numberOfConsultations;
    }

    public void setNumberOfConsultations(int numberOfConsultations) {
        this.numberOfConsultations = numberOfConsultations;
    }
}
