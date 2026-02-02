package com.functionalInterfaces.paymentgatewayintegration;

public class OldProvider implements PaymentProcessor {
	
	@Override
	public void pay(double amount) {
		System.out.println("Old Provider-> Amount pay done "+amount);
	}
}
