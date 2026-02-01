package com.lambdaexpressions.customsortingecommerce;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Product milk = new Product("milk",36,4.2,4);
		Product bread = new Product("milk",50,5.3,4);
		Product shop = new Product("milk",10,4.3,3);
		Product shirt = new Product("shirt",500,5.4,20);
		
		Ecommerce e = new Ecommerce();
		e.addProduct(milk);
		e.addProduct(bread);
		e.addProduct(shop);
		e.addProduct(shirt);
		
		System.out.println("Sort by price: ");
		e.productList.stream()
						.sorted(Comparator.comparing(Product-> Product.getProductPrice()))
						.forEach(System.out::println);
		
		System.out.println("\nSort by rating");
		e.productList.stream()
						.sorted(Comparator.comparing(Product-> Product.getRating()))
						.forEach(System.out::println);	
		
		System.out.println("\nSort by discount");
		e.productList.stream()
						.sorted(Comparator.comparing(Product-> Product.getDiscount()))
						.forEach(System.out::println);
	}
}