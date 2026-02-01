package com.functionalInterfaces.multivehiclerental;

@FunctionalInterface
public interface Vehicle {
	void rent();
	
	default void returnVehicle() {
		System.out.println("Vehicle return!");
	}
}