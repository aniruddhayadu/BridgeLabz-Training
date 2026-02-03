package com.collectors.orderrevenuesummary;

public class Order {
	private String customerName;
	private double total;

	public Order(String customerName, double total) {
		this.customerName = customerName;
		this.total = total;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getTotal() {
		return total;
	}
}