package com.encapsulationandpolymorphism.vehiclerental;

public class Truck extends Vehicle implements Insurable {
    private double insuranceRate;
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceRate = insuranceRate;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // trucks have 20% extra rental cost
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate / 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber + ", Insurance Amount: " + calculateInsurance();
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
