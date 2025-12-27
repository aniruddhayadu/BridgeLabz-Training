package com.constructorandaccessmodifiers.level1;

public class Product {
	
	 String productName;
	 int price;
	 static int totalProducts;
	 Product(String productName, int price){
		 this.productName = productName;
		 this.price = price;
		 totalProducts++;
	 }
	 void displayProductDetails() {
		 System.out.println("Product Name: " + productName);
		 System.out.println("Price: " + price);
	 }
	 static void displayTotalProducts() {
		 System.out.println("Total products: " + totalProducts);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("Cup",20);
		Product product2 = new Product("Tea",34);
		product1.displayProductDetails();
		product2.displayProductDetails();
		Product.displayTotalProducts();
	}

}
