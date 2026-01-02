package com.vehiclerentalapplication;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    public double calculateRent(int days) {
        return baseRate * days; // No surcharge
    }
}
