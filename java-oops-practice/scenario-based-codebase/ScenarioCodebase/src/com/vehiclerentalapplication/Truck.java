package com.vehiclerentalapplication;

public class Truck extends Vehicle {
    private double loadSurcharge = 1000;

    public Truck(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + loadSurcharge;
    }
}
