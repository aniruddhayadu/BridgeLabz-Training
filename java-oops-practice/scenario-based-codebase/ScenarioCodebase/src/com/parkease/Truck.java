package com.parkease;

public class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    public double calculateCharges(int duration) {
        double charge = baseRate * duration;
        if (duration > 4) {
            charge += 200;
        }
        return charge;
    }
}

