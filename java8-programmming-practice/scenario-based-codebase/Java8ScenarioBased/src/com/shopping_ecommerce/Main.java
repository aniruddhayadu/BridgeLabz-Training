package com.shopping_ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(101,"Shirt",220));
		productList.add(new Product(102,"Bag",4043));
	    productList.add(new Product(103,"Bottle",332));
	   	productList.add(new Product(104,"Car wheel",22504));
		productList.add(new Product(105,"MAC-1",900000));
		productList.add(new Product(106,"Hard Disk",7900));
        productList.add(new Product(107,"Jense",900));
        productList.add(new Product(108,"NoteBooks",2550));
        productList.add(new Product(109,"Charger",543));
		
      
		/*
		
			1.Use lambda to apply 10% discount on product price.
			
			2.Sort products by price using lambda.
			
			3.Use lambda to check free delivery eligibility (amount > 500).
			
			4.Use lambda to calculate final bill amount.
			
			5.Use lambda to print product names.
		 */
		//System.out.println("Before Discount Price is: "+x.getPrice()+ "--After 10% Discount Price: "+ (x.getPrice()-x.getPrice()*0.10)));
		
		System.out.println("1.Use lambda to apply 10% discount on product price.");
		productList.stream()
					.forEach(x-> {
						System.out.println("Before Discount Price is: "+x.getPrice());
						double discount = x.getPrice()-(x.getPrice()*0.10);
						x.setPrice(discount);
						System.out.println("After 10% Discount Price: "+x.getPrice());
					});
		
		
		System.out.println("\n2.Sort products by price using lambda.");
		productList.sort((a,b) -> Double.compare(a.getPrice(), b.getPrice()));
		productList.stream().forEach(System.out::println);
		
		
		
		
		System.out.println("\n3.Use lambda to check free delivery eligibility (amount > 500).");
		productList.stream()
					.filter(Product-> Product.getPrice()>500)
					.forEach(System.out::println);
	
		
		System.out.println("\n4.Use lambda to calculate final bill amount.");
		System.out.println("Total Price: "+
					productList.stream()
								.collect(Collectors.summingDouble(Product::getPrice))
				);
		
		
		System.out.println("\n5.Use lambda to print product names.");
		productList.stream()
					.map(Product::getName)
					.forEach(System.out::println);
	}
}
