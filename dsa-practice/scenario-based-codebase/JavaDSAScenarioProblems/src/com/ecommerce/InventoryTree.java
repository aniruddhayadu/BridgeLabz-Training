package com.ecommerce;

public class InventoryTree {

	Node root;
	void insert(int sku, Product product) {
		root = insertRec(root, sku, product);
	}

	Node insertRec(Node root, int sku, Product product) {
		if (root == null)
			return new Node(sku, product);

		if (sku < root.sku)
			root.left = insertRec(root.left, sku, product); 
		else if (sku > root.sku)
			root.right = insertRec(root.right, sku, product); 
		
		return root; 
	}

	Product search(int sku) {
		return searchRec(root, sku);
	}

	Product searchRec(Node root, int sku) {
		if (root == null)
			return null; 
		
		if (root.sku == sku)
			return root.product; 

		if (sku < root.sku)
			return searchRec(root.left, sku); 
		else
			return searchRec(root.right, sku);
	}

	void updatePrice(int sku, double newPrice) {
		Product p = search(sku); 
		if (p != null)
			p.price = newPrice;
	}

	void displaySorted() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left); 
			System.out.println("SKU " + root.sku + " → " + root.product.name + " | ₹" + root.product.price);
			inorderRec(root.right); 
		}
	}
}
