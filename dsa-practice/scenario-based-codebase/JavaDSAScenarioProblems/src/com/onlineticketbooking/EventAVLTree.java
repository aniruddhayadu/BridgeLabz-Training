package com.onlineticketbooking;

public class EventAVLTree {

	private EventNode root;

	// Get height of node
	private int height(EventNode node) {
		return node == null ? 0 : node.height;
	}

	// Get balance factor
	private int getBalance(EventNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right rotation
	private EventNode rightRotate(EventNode y) {
		EventNode x = y.left;
		EventNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotation
	private EventNode leftRotate(EventNode x) {
		EventNode y = x.right;
		EventNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Insert event
	public void insertEvent(int startTime, String name) {
		root = insert(root, startTime, name);
	}

	// Recursive insert
	private EventNode insert(EventNode node, int time, String name) {

		if (node == null)
			return new EventNode(time, name);

		if (time < node.startTime)
			node.left = insert(node.left, time, name);
		else
			node.right = insert(node.right, time, name);

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// LL case
		if (balance > 1 && time < node.left.startTime)
			return rightRotate(node);

		// RR case
		if (balance < -1 && time > node.right.startTime)
			return leftRotate(node);

		// LR case
		if (balance > 1 && time > node.left.startTime) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL case
		if (balance < -1 && time < node.right.startTime) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Cancel event
	public void cancelEvent(int startTime) {
		root = delete(root, startTime);
	}

	// Recursive delete
	private EventNode delete(EventNode node, int time) {

		if (node == null)
			return null;

		if (time < node.startTime)
			node.left = delete(node.left, time);
		else if (time > node.startTime)
			node.right = delete(node.right, time);
		else {
			if (node.left == null || node.right == null)
				node = (node.left != null) ? node.left : node.right;
			else {
				EventNode successor = minValueNode(node.right);
				node.startTime = successor.startTime;
				node.eventName = successor.eventName;
				node.right = delete(node.right, successor.startTime);
			}
		}

		if (node == null)
			return null;

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		if (balance > 1 && getBalance(node.left) >= 0)
			return rightRotate(node);

		if (balance > 1 && getBalance(node.left) < 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (balance < -1 && getBalance(node.right) <= 0)
			return leftRotate(node);

		if (balance < -1 && getBalance(node.right) > 0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Find minimum node
	private EventNode minValueNode(EventNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// Display events in order
	public void showEvents() {
		System.out.println("\nUpcoming Events");
		inorder(root);
	}

	// Inorder traversal
	private void inorder(EventNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.startTime + " -> " + node.eventName);
			inorder(node.right);
		}
	}
}
