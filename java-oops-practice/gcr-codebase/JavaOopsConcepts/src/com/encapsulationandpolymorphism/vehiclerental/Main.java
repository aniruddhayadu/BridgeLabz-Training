package com.encapsulationandpolymorphism.vehiclerental;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C101", 100, 5, "CAR12345");
        Bike bike = new Bike("B202", 50, 3, "BIKE6789");
        Truck truck = new Truck("T303", 200, 7, "TRUCK9876");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }

            System.out.println();
        }
    }
}

