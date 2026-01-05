package com.linkedlist.singlelinkedlist.inventorymanagement;

public class Inventory {

	 private ItemNode head;


	 // Add item at beginning
	 public void addAtBeginning(int id, String name, int qty, double price) {
	     ItemNode newNode = new ItemNode(id, name, qty, price);
	     newNode.next = head;
	     head = newNode;
	 }

	 // Add item at end
	 public void addAtEnd(int id, String name, int qty, double price) {
	     ItemNode newNode = new ItemNode(id, name, qty, price);

	     if (head == null) {
	         head = newNode;
	         return;
	     }

	     ItemNode temp = head;
	     while (temp.next != null) {
	         temp = temp.next;
	     }
	     temp.next = newNode;
	 }

	 // Add item at specific position (1-based index)
	 public void addAtPosition(int position, int id, String name, int qty, double price) {
	     if (position <= 1) {
	         addAtBeginning(id, name, qty, price);
	         return;
	     }

	     ItemNode temp = head;
	     for (int i = 1; i < position - 1 && temp != null; i++) {
	         temp = temp.next;
	     }

	     if (temp == null) {
	         System.out.println("Invalid position");
	         return;
	     }

	     ItemNode newNode = new ItemNode(id, name, qty, price);
	     newNode.next = temp.next;
	     temp.next = newNode;
	 }


	 // Remove item by Item ID
	 public void removeById(int id) {
	     if (head == null) return;

	     if (head.itemId == id) {
	         head = head.next;
	         System.out.println("Item removed successfully");
	         return;
	     }

	     ItemNode temp = head;
	     while (temp.next != null && temp.next.itemId != id) {
	         temp = temp.next;
	     }

	     if (temp.next == null) {
	         System.out.println("Item not found");
	     } else {
	         temp.next = temp.next.next;
	         System.out.println("Item removed successfully");
	     }
	 }



	 // Update quantity by Item ID
	 public void updateQuantity(int id, int newQty) {
	     ItemNode temp = head;
	     while (temp != null) {
	         if (temp.itemId == id) {
	             temp.quantity = newQty;
	             System.out.println("Quantity updated");
	             return;
	         }
	         temp = temp.next;
	     }
	     System.out.println("Item not found");
	 }



	 // Search by Item ID
	 public void searchById(int id) {
	     ItemNode temp = head;
	     while (temp != null) {
	         if (temp.itemId == id) {
	             displayItem(temp);
	             return;
	         }
	         temp = temp.next;
	     }
	     System.out.println("Item not found");
	 }

	 // Search by Item Name
	 public void searchByName(String name) {
	     ItemNode temp = head;
	     boolean found = false;

	     while (temp != null) {
	         if (temp.itemName.equalsIgnoreCase(name)) {
	             displayItem(temp);
	             found = true;
	         }
	         temp = temp.next;
	     }

	     if (!found) System.out.println("Item not found");
	 }



	 // Calculate total inventory value
	 public double calculateTotalValue() {
	     double total = 0;
	     ItemNode temp = head;

	     while (temp != null) {
	         total += temp.price * temp.quantity;
	         temp = temp.next;
	     }
	     return total;
	 }



	 public void sortByPrice(boolean ascending) {
	     head = mergeSort(head, ascending, true);
	 }

	 public void sortByName(boolean ascending) {
	     head = mergeSort(head, ascending, false);
	 }

	 private ItemNode mergeSort(ItemNode head, boolean asc, boolean byPrice) {
	     if (head == null || head.next == null)
	         return head;

	     ItemNode middle = getMiddle(head);
	     ItemNode nextOfMiddle = middle.next;
	     middle.next = null;

	     ItemNode left = mergeSort(head, asc, byPrice);
	     ItemNode right = mergeSort(nextOfMiddle, asc, byPrice);

	     return sortedMerge(left, right, asc, byPrice);
	 }

	 private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byPrice) {
	     if (a == null) return b;
	     if (b == null) return a;

	     boolean condition;
	     if (byPrice) {
	         condition = asc ? a.price <= b.price : a.price >= b.price;
	     } else {
	         condition = asc
	                 ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
	                 : a.itemName.compareToIgnoreCase(b.itemName) >= 0;
	     }

	     ItemNode result;
	     if (condition) {
	         result = a;
	         result.next = sortedMerge(a.next, b, asc, byPrice);
	     } else {
	         result = b;
	         result.next = sortedMerge(a, b.next, asc, byPrice);
	     }
	     return result;
	 }

	 private ItemNode getMiddle(ItemNode head) {
	     ItemNode slow = head, fast = head.next;
	     while (fast != null && fast.next != null) {
	         slow = slow.next;
	         fast = fast.next.next;
	     }
	     return slow;
	 }



	 public void displayInventory() {
	     ItemNode temp = head;
	     if (temp == null) {
	         System.out.println("Inventory empty");
	         return;
	     }

	     while (temp != null) {
	         displayItem(temp);
	         temp = temp.next;
	     }
	 }

	 private void displayItem(ItemNode item) {
	     System.out.println(
	             "ID: " + item.itemId +
	             ", Name: " + item.itemName +
	             ", Qty: " + item.quantity +
	             ", Price: " + item.price
	     );
	 }
}