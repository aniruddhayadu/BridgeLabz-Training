package com.gamingavltree;

public class PlayerNode {

	String playerId; // player identifier
	int score; // player score
	int height; // height of node for AVL balancing

	PlayerNode left; // left child
	PlayerNode right; // right child

	// Constructor
	PlayerNode(String playerId, int score) {
		this.playerId = playerId;
		this.score = score;
		this.height = 1; // new node starts as leaf
	}
}
