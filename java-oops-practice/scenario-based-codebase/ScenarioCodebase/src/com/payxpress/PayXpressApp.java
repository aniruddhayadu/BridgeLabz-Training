package com.payxpress;

public class PayXpressApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bill bill1 = new ElectricityBill(1200, "15-Jan-2026");
		Bill bill2 = new WaterBill(450, "18-Jan-2026");
		Bill bill3 = new InternetBill(999, "20-Jan-2026");
		
		bill1.sendReminder();
		bill2.sendReminder();
		bill3.sendReminder();
		System.out.println();
		
		bill1.pay();
		bill2.pay();
		bill3.pay();
		System.out.println();
		
		double lateAmount = bill1.calculateLateFee(100);
		System.out.println("Electricity bill with late fee: rs" + lateAmount);
		
	}

}
