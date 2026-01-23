package com.musicapp;

public class MusicTree {

	Node root; // Root of the tree

	// Insert new track (ordered by title)
	void insert(Song song) {
		root = insertRec(root, song);
	}

	// Insert using alphabetical order of title
	Node insertRec(Node root, Song song) {
		if (root == null)
			return new Node(song); // Create node if empty

		if (song.title.compareToIgnoreCase(root.song.title) < 0)
			root.left = insertRec(root.left, song); // Go left
		else
			root.right = insertRec(root.right, song); // Go right

		return root;
	}

	// Search song using Track ID
	Song searchByTrackId(int trackId) {
		return searchRec(root, trackId);
	}

	// Recursive traversal to find track ID
	Song searchRec(Node root, int trackId) {
		if (root == null)
			return null; // Not found

		if (root.song.trackId == trackId)
			return root.song; // Found

		Song leftResult = searchRec(root.left, trackId); // Search left
		if (leftResult != null)
			return leftResult;

		return searchRec(root.right, trackId); // Search right
	}

	// Display songs alphabetically
	void showPlaylistAlphabetically() {
		inorderRec(root); // Inorder traversal
	}

	// Inorder  Alphabetical order by title
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left); // Left subtree
			System.out.println(root.song.title + " | " + root.song.artist + " (ID: " + root.song.trackId + ")");
			inorderRec(root.right); // Right subtree
		}
	}
}