package com.lambdaexpressions.invoiceobjectcreation;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> transcationID = List.of(2,32,123,121,232,233);
		
		List<Invoice> invoice = transcationID.stream()
									.map(Invoice::new)
									.toList();
		
		invoice.forEach(System.out::println);
	}
}
