package com.encapsulationandpolymorphism.ridehailing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C101", "Alice", 15, "Downtown");
        Bike bike = new Bike("B202", "Bob", 10, "Uptown");
        Auto auto = new Auto("A303", "Charlie", 8, "Suburb");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 12.5; // kms

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);
            System.out.println();
        }

        // Update locations
        car.updateLocation("Airport");
        System.out.println(car.getDriverName() + " new location: " + car.getCurrentLocation());
    }
}

