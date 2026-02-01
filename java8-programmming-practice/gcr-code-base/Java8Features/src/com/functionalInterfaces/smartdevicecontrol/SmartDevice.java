package com.functionalInterfaces.smartdevicecontrol;

@FunctionalInterface
public interface SmartDevice {
	void turnOn();
	
	default void turnOf() {
		System.out.println("Device Turn Of.");
	}
}
