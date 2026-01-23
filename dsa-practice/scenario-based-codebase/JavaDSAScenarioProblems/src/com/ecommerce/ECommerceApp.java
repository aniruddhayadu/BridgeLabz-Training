package com.ecommerce;

public class ECommerceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryTree inventory = new InventoryTree();

		// Insert products (SKU, Product)
		inventory.insert(1003, new Product("Laptop", 55000));
		inventory.insert(1001, new Product("Mobile", 20000));
		inventory.insert(1005, new Product("Headphones", 3000));
		inventory.insert(1002, new Product("Keyboard", 1500));

		// Lookup
		Product p = inventory.search(1002);
		System.out.println("Lookup SKU 1002: " + p.name + " | ₹" + p.price);

		// Price Update
		inventory.updatePrice(1003, 52000);
		System.out.println("Updated SKU 1003 price");

		// Sorted SKU Display
		System.out.println("\nProducts in Sorted SKU Order:");
		inventory.displaySorted();
	}

}
