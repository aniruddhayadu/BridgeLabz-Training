package com.payxpress;

public class InternetBill extends Bill {

	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate); 
	}

	public void sendReminder() {
		System.out.println("Internet Bill Reminder: Stay connected by paying on time.");
	}
}