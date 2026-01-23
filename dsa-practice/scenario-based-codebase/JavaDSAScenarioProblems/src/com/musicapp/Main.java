package com.musicapp;

public class Main {
	public static void main(String[] args) {

		MusicTree library = new MusicTree();

		// Insert songs
		library.insert(new Song(102, "Shape of You", "Ed Sheeran"));
		library.insert(new Song(101, "Believer", "Imagine Dragons"));
		library.insert(new Song(105, "Perfect", "Ed Sheeran"));
		library.insert(new Song(103, "Closer", "Chainsmokers"));

		//  Search by Track ID
		Song s = library.searchByTrackId(103);
		System.out.println("Search Result: " + s.title + " by " + s.artist);

		// Show playlist alphabetically
		System.out.println("\nPlaylist (Alphabetical Order):");
		library.showPlaylistAlphabetically();
	}
}
