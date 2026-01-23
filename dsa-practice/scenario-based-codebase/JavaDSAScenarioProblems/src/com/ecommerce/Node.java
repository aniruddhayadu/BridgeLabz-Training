package com.ecommerce;

class Node {
	int sku; 
	Product product; 
	Node left, right;

	Node(int sku, Product product) {
		this.sku = sku;
		this.product = product;
		left = right = null; 
	}
}