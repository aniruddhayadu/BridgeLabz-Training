package com.generics.smartwarehouse;

public abstract class Product {

	// Name of the product
	protected String productName;

	// Constructor to initialize product name
	public Product(String productName) {
		this.productName = productName;
	}

	// Abstract method to display product details
	public abstract void showDetails();
}