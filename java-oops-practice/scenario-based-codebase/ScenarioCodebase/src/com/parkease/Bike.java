package com.parkease;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20); 
    }

    public double calculateCharges(int duration) {
        double charge = baseRate * duration;
        if (duration > 6) {
            charge += 50;
        }
        return charge;
    }
}
