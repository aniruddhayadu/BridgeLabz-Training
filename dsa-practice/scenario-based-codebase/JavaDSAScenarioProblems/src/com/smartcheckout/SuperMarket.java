package com.smartcheckout;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class SuperMarket {
	// Static instance of class
	public static Queue<Customer> billingQueue = new ArrayDeque<>();
	public static Map<String, Integer> itemPrice = new HashMap<>();
	public static Map<String, Integer> itemStock = new HashMap<>();

	// Method to stock item inside market
	public static void stockItem(String name, int quantity, int price) {
		itemPrice.put(name, price);
		itemStock.put(name, quantity);
	}

	// Method to add customer in billing queue
	public static void addBillingQueue(Customer customer) {
		billingQueue.add(customer);
	}

	// Method to Bill customer products
	public static void purchaseItem() {
 
		while (billingQueue.peek() != null) {
			Customer customer = billingQueue.poll();
			System.out.println("Next Customer -> " + customer.name);
			double bill = 0;
			System.out.println("-----------------------------------------");
			System.out.println("Item\tQty\tPrice\tTotal");
			System.out.println("-----------------------------------------");
			for (String i : customer.itemList.keySet()) {
				if (itemStock.containsKey(i)) {
					if (itemStock.get(i) >= customer.itemList.get(i)) {
						bill += itemPrice.get(i) * customer.itemList.get(i);
						itemStock.put(i, (itemStock.get(i) - customer.itemList.get(i)));

						System.out.println(i + "\t" + customer.itemList.get(i) + "\t" + itemPrice.get(i) + "\t"
								+ (itemPrice.get(i) * customer.itemList.get(i)));

					} else {
						System.out.println(i + "  Out of Stock");
					}

				} else {
					System.out.println(i + "  not available in market");
				}

			}
			System.out.println("-----------------------------------------");
			System.out.println("Customer -> " + customer.name);
			System.out.println("Total Bill " + bill);
			System.out.println("-----------------------------------------");
			System.out.println(customer.name + " purchased successfully");
			System.out.println("-----------------------------------------");
			System.out.println("\n\n\n");

		}
	}

	public static void main(String[] args) {
		// Stocking items in market
		stockItem("Rice", 100, 40);
		stockItem("Wheat", 100, 30);
		stockItem("Refined", 100, 110);
		stockItem("Sugar", 100, 33);
		stockItem("Oil", 100, 140);
		stockItem("Tea", 100, 80);
		stockItem("Biscuit", 100, 40);
		stockItem("Soap", 100, 20);
		stockItem("Detergent", 100, 70);

		// Creating customer object
		Customer customer1 = new Customer("Arif");
		customer1.addItem("Biscuit", 5);
		customer1.addItem("Sugar", 1);
		customer1.addItem("Refined", 2);
		customer1.addItem("Oil", 4);
		customer1.addItem("Wheat", 10);

		Customer customer2 = new Customer("Rohan");
		customer2.addItem("Rice", 5);
		customer2.addItem("Sugar", 1);
		customer2.addItem("Refined", 2);
		customer2.addItem("Soap", 4);
		customer2.addItem("Wheat", 10);

		Customer customer3 = new Customer("Rahul");
		customer3.addItem("Rice", 5);
		customer3.addItem("Tea", 1);
		customer3.addItem("Refined", 2);
		customer3.addItem("Oil", 4);
		customer3.addItem("Soap", 100);

		// Adding customer to billing queue
		addBillingQueue(customer1);
		addBillingQueue(customer2);
		addBillingQueue(customer3);

		// Billing customer items
		purchaseItem();

	}

}
