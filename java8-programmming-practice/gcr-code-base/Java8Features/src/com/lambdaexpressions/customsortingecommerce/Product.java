package com.lambdaexpressions.customsortingecommerce;

public class Product {
	private String name;
	private double productPrice;
	private double rating;
	private double discount;
	
	public Product(String name, double productPrice, double rating, double discount) {
		this.name = name;
		this.productPrice = productPrice;
		this.rating = rating;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", productPrice=" + productPrice + ", rating=" + rating + ", discount="
				+ discount + "]";
	}
}
