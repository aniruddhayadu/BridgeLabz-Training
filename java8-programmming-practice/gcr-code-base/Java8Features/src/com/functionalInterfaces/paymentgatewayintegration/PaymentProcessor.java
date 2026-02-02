package com.functionalInterfaces.paymentgatewayintegration;

public interface PaymentProcessor {
	default void refund(double amount) {
		System.out.println("Refund done.");
	}
	
	void pay(double amount);
	
}
