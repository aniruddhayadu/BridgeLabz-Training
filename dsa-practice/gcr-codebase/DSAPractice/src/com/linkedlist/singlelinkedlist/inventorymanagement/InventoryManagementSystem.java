package com.linkedlist.singlelinkedlist.inventorymanagement;

public class InventoryManagementSystem {

	 public static void main(String[] args) {

	     Inventory inventory = new Inventory();

	     inventory.addAtEnd(101, "Laptop", 5, 55000);
	     inventory.addAtBeginning(102, "Mouse", 20, 500);
	     inventory.addAtEnd(103, "Keyboard", 10, 1500);
	     inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

	     System.out.println("\nInventory List:");
	     inventory.displayInventory();

	     inventory.updateQuantity(102, 25);
	     inventory.searchById(101);

	     System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

	     System.out.println("\nSorted by Price (Ascending):");
	     inventory.sortByPrice(true);
	     inventory.displayInventory();

	     System.out.println("\nSorted by Name (Descending):");
	     inventory.sortByName(false);
	     inventory.displayInventory();

	     inventory.removeById(103);
	     System.out.println("\nAfter Removing Item:");
	     inventory.displayInventory();
	 }
}