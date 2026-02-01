package com.lambdaexpressions.notificationfiltering;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.alerts.add(new Alert("EMERGENCY","Hert Rate Critical"));
		h.alerts.add(new Alert("MEDICINE","Normal Fever"));
		h.alerts.add(new Alert("Appointment","Health Checkup"));
		
		Predicate<Alert> emergencyOnly = alert-> alert.getType().equalsIgnoreCase("EMERGENCY");
		
		h.alerts.stream().filter(emergencyOnly).forEach(System.out::println);
		
		
		h.alerts.stream().filter(Alert-> Alert.getType().equalsIgnoreCase("Medicine")).forEach(System.out::println);
	}
}
