package com.hospitalmanagementsystem;

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }
   
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Consultation Fee: " + consultationFee);
    }
}