package com.collections.map.shoppingcart;

import java.util.*;

class ShoppingCart {

	private HashMap<String, Double> priceMap = new HashMap<>();

	private LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();

	public void addProduct(String product, double price) {
		priceMap.put(product, price);
	}

	public void addToCart(String product, int quantity) {

		if (!priceMap.containsKey(product)) {
			System.out.println("Product not found: " + product);
			return;
		}

		cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
	}

	public void displayCart() {
		System.out.println("\nCart Items (Insertion Order):");
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			System.out.println(
					entry.getKey() + " | Qty: " + entry.getValue() + " | Price: ₹" + priceMap.get(entry.getKey()));
		}
	}

	public void displaySortedByPrice() {

		TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

		for (String product : cartItems.keySet()) {
			double price = priceMap.get(product);

			sortedMap.putIfAbsent(price, new ArrayList<>());
			sortedMap.get(price).add(product);
		}

		System.out.println("\nItems Sorted by Price:");
		for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
			for (String product : entry.getValue()) {
				System.out.println(product + " → ₹" + entry.getKey());
			}
		}
	}

	// Calculate total bill
	public double calculateTotal() {
		double total = 0;
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			total += priceMap.get(entry.getKey()) * entry.getValue();
		}
		return total;
	}
}