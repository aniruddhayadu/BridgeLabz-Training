package com.payxpress;

public class WaterBill extends Bill {

	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate); 
	}

	public void sendReminder() {
		System.out.println("Water Bill Reminder: Pay to ensure uninterrupted water supply.");
	}
}