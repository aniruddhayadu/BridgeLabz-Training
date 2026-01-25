package com.gamingavltree;

public class LeaderboardApp {

	public static void main(String[] args) {

		AVLTree leaderboard = new AVLTree();

		// Scenario 1: Insert players
		leaderboard.insertPlayer("PlayerA", 9800);
		leaderboard.insertPlayer("PlayerB", 9700);
		leaderboard.insertPlayer("PlayerC", 9650);
		leaderboard.insertPlayer("PlayerD", 9600);
		leaderboard.insertPlayer("PlayerE", 9500);
		leaderboard.insertPlayer("PlayerF", 9400);
		leaderboard.insertPlayer("PlayerG", 9300);
		leaderboard.insertPlayer("PlayerH", 9200);
		leaderboard.insertPlayer("PlayerI", 9100);
		leaderboard.insertPlayer("PlayerJ", 9000);

		// Scenario 2: Display leaderboard
		leaderboard.displayTop10();

		// Scenario 3: Remove player
		System.out.println("\nRemoving PlayerD");
		leaderboard.removePlayer("PlayerD", 9600);

		leaderboard.displayTop10();
	}
}
