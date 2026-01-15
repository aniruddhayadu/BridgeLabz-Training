package com.smartcheckout;

import java.util.HashMap;
import java.util.Map;

//Customer node to store customer name and item list
public class Customer {
	String name;
	Map<String, Integer> itemList = new HashMap<>();

	// Parameterized constructor
	public Customer(String name) {

		this.name = name;

	}

	// Method to add Item to customer shopping list
	void addItem(String item, int quantity) {
		itemList.put(item, quantity);
	}
}