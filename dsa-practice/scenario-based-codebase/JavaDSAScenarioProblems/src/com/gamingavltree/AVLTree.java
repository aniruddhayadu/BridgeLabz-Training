package com.gamingavltree;

import java.util.ArrayList;
import java.util.List;

// AVL Tree to manage leaderboard
public class AVLTree {

	private PlayerNode root; // root of AVL tree

	// Get height of node
	private int height(PlayerNode node) {
		return node == null ? 0 : node.height;
	}

	// Get balance factor
	private int getBalance(PlayerNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right rotation
	private PlayerNode rightRotate(PlayerNode y) {
		PlayerNode x = y.left;
		PlayerNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotation
	private PlayerNode leftRotate(PlayerNode x) {
		PlayerNode y = x.right;
		PlayerNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Insert or update player
	public void insertPlayer(String playerId, int score) {
		root = insert(root, playerId, score);
	}

	// Recursive insert
	private PlayerNode insert(PlayerNode node, String id, int score) {

		if (node == null)
			return new PlayerNode(id, score);

		// Higher score goes left
		if (score > node.score)
			node.left = insert(node.left, id, score);
		else
			node.right = insert(node.right, id, score);

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// LL case
		if (balance > 1 && score > node.left.score)
			return rightRotate(node);

		// RR case
		if (balance < -1 && score < node.right.score)
			return leftRotate(node);

		// LR case
		if (balance > 1 && score < node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL case
		if (balance < -1 && score > node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Remove player
	public void removePlayer(String playerId, int score) {
		root = delete(root, playerId, score);
	}

	// Recursive delete
	private PlayerNode delete(PlayerNode node, String id, int score) {

		if (node == null)
			return null;

		if (score > node.score)
			node.left = delete(node.left, id, score);
		else if (score < node.score)
			node.right = delete(node.right, id, score);
		else {
			if (node.left == null || node.right == null)
				node = (node.left != null) ? node.left : node.right;
			else {
				PlayerNode successor = minValueNode(node.right);
				node.playerId = successor.playerId;
				node.score = successor.score;
				node.right = delete(node.right, successor.playerId, successor.score);
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

	// Find minimum value node
	private PlayerNode minValueNode(PlayerNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// Display top 10 players
	public void displayTop10() {
		List<PlayerNode> list = new ArrayList<>();
		collectTopPlayers(root, list);

		System.out.println("\nTop Players");
		int rank = 1;
		for (PlayerNode p : list) {
			System.out.println(rank++ + ". " + p.playerId + " - " + p.score);
		}
	}

	// Inorder traversal to collect top players
	private void collectTopPlayers(PlayerNode node, List<PlayerNode> list) {
		if (node == null || list.size() == 10)
			return;

		collectTopPlayers(node.left, list);

		if (list.size() < 10)
			list.add(node);

		collectTopPlayers(node.right, list);
	}
}