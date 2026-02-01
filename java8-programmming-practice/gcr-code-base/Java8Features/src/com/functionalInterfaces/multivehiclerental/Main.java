package com.functionalInterfaces.multivehiclerental;

public class Main {

	public static void main(String[] args) {
		Vehicle car = ()-> System.out.println("Vehicle goes for rent");
		
		Vehicle bike = ()-> System.out.println("\nBike goes for rent");
		
		Vehicle bus = ()-> System.out.println("\nBus goes for rent");
		
		
		car.rent();
		car.returnVehicle();
		
		bike.rent();
		bike.returnVehicle();
		
		bus.rent();
		bus.returnVehicle();
	}
}
