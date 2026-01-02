package com.vehiclerentalapplication;

public class VehicleRentalApp {
    public static void main(String[] args) {

        Vehicle bike = new Bike("B101", "Yamaha", 300);
        Vehicle car = new Car("C202", "Honda", 1500);
        Vehicle truck = new Truck("T303", "Tata", 3000);

        Customer customer = new Customer("CU01", "Rahul");

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 1);
    }
}
