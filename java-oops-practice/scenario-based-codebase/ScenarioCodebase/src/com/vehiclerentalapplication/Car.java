package com.vehiclerentalapplication;

public class Car extends Vehicle {
    private double insuranceFee = 500;

    public Car(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + insuranceFee;
    }
}
