package com.functionalInterfaces.paymentgatewayintegration;

public class PaymentGatewayIntegration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldProvider p = new OldProvider();
		p.pay(49423);
		
		NewProvider n = new NewProvider();
		n.pay(43345);
		n.refund(344);
	}

}
