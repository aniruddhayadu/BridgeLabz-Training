package com.functionalInterfaces.smartdevicecontrol;

public class Main {

	public static void main(String[] args) {
		SmartDevice light = () -> System.out.println("Light On");
		
		SmartDevice TV = () -> System.out.println("TV On");
		
		SmartDevice AC = () -> System.out.println("AC On");
		
		light.turnOn();
		light.turnOf();
		
		
		TV.turnOn();
		TV.turnOf();
		
		AC.turnOn();
		AC.turnOf();
	}
}