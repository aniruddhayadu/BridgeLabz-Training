package com.parkease;

public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    public double calculateCharges(int duration) {
        double charge = baseRate * duration;
        if (duration > 5) {
            charge += 100; 
        }
        return charge;
    }
}

