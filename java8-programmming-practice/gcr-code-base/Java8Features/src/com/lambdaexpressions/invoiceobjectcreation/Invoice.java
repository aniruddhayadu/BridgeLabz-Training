package com.lambdaexpressions.invoiceobjectcreation;

public class Invoice {
	int id;

	public Invoice(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + "]";
	}
}