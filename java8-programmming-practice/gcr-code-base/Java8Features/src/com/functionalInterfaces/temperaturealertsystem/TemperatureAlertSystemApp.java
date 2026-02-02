package com.functionalInterfaces.temperaturealertsystem;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;

public class TemperatureAlertSystemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double threeshold = 30.00;
		
		List<Temperature> list = new ArrayList<>();
		list.add(new Temperature(27.26));
		list.add(new Temperature(37.53));
		list.add(new Temperature(30.24));
		
		Predicate<Temperature> corss = temperature-> temperature.getValue()>threeshold;
		
		list.stream().filter(corss).forEach(x-> System.out.println("Temperature alert: "+ x.getValue()));
	}

}