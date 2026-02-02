package com.functionalInterfaces.paymentgatewayintegration;

public class NewProvider implements PaymentProcessor {
	@Override
	public void pay(double amount) {
		System.out.println("New Provider-> Payement done "+amount);
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("New Provider-> Payment return "+amount);
	}
}
