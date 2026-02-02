package com.functionalInterfaces.unitconversiontool;

public interface Logistics {
	static void kmToMiles(double km) {
		System.out.println(km+" Km to Miles: "+(km/1.609));
	}
	
	static void kgToIbs(double kg) {
		System.out.println(kg+" kg to lbs: "+(kg*2.205));
	}
}
