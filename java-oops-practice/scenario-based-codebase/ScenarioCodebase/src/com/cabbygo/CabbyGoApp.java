package com.cabbygo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Rahul", "DL12345", 4.8);
        Driver driver2 = new Driver("Ananya", "DL54321", 4.9);

        Vehicle mini = new Mini("KA01AA1111");
        Vehicle sedan = new Sedan("KA01BB2222");
        Vehicle suv = new SUV("KA01CC3333");

        IRideService rideService = new RideService();

        // First Ride
        rideService.bookRide(driver1, sedan, 12); // 12 km ride
        rideService.endRide();

        // Second Ride
        rideService.bookRide(driver2, suv, 25); // 25 km ride
        rideService.endRide();

        // Third Ride
        rideService.bookRide(driver1, mini, 8); // 8 km ride
        rideService.endRide();
    }
}
