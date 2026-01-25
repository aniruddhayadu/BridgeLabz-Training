package com.hospitalqueuemangement;

public class HospitalAVLTree {

	private PatientNode root;

	// Get height of node
	private int height(PatientNode node) {
		return node == null ? 0 : node.height;
	}

	// Get balance factor
	private int getBalance(PatientNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right rotation
	private PatientNode rightRotate(PatientNode y) {
		PatientNode x = y.left;
		PatientNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotation
	private PatientNode leftRotate(PatientNode x) {
		PatientNode y = x.right;
		PatientNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Register patient
	public void registerPatient(int time, String name) {
		root = insert(root, time, name);
	}

	// Recursive insert
	private PatientNode insert(PatientNode node, int time, String name) {

		if (node == null)
			return new PatientNode(time, name);

		if (time < node.checkInTime)
			node.left = insert(node.left, time, name);
		else
			node.right = insert(node.right, time, name);

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// LL case
		if (balance > 1 && time < node.left.checkInTime)
			return rightRotate(node);

		// RR case
		if (balance < -1 && time > node.right.checkInTime)
			return leftRotate(node);

		// LR case
		if (balance > 1 && time > node.left.checkInTime) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL case
		if (balance < -1 && time < node.right.checkInTime) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Discharge patient
	public void dischargePatient(int time) {
		root = delete(root, time);
	}

	// Recursive delete
	private PatientNode delete(PatientNode node, int time) {

		if (node == null)
			return null;

		if (time < node.checkInTime)
			node.left = delete(node.left, time);
		else if (time > node.checkInTime)
			node.right = delete(node.right, time);
		else {
			if (node.left == null || node.right == null)
				node = (node.left != null) ? node.left : node.right;
			else {
				PatientNode successor = minValueNode(node.right);
				node.checkInTime = successor.checkInTime;
				node.patientName = successor.patientName;
				node.right = delete(node.right, successor.checkInTime);
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
	private PatientNode minValueNode(PatientNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// Display patients by arrival time
	public void displayQueue() {
		System.out.println("\nPatient Queue (Arrival Order)");
		inorder(root);
	}

	// Inorder traversal
	private void inorder(PatientNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.checkInTime + " -> " + node.patientName);
			inorder(node.right);
		}
	}
}
