package com.payxpress;

public class ElectricityBill extends Bill {
	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate);
	}
	
	public void sendReminder() {
		System.out.println("Electricity Bill Reminder: Avoid power disconnection!");
	}
}
