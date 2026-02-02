package com.functionalInterfaces.digitalpayment;

public class DigitalPaymentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalPaymentInterface UPI = () -> System.out.println("Pay by UPI");
		DigitalPaymentInterface creditCard = () -> System.out.println("Pay by credit card");
		DigitalPaymentInterface wallet = () -> System.out.println("Pay by wallet");
		
		UPI.pay();
		
		creditCard.pay();
		
		wallet.pay();
	}

}
