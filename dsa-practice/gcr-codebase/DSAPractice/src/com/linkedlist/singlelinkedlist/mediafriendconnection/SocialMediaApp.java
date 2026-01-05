package com.linkedlist.singlelinkedlist.mediafriendconnection;

public class SocialMediaApp {
	public static void main(String[] args) {

	     SocialNetwork network = new SocialNetwork();

	     // Adding users
	     network.addUser(1, "Arif", 22);
	     network.addUser(2, "Rahul", 23);
	     network.addUser(3, "Sneha", 21);
	     network.addUser(4, "Aman", 24);

	     // Adding friend connections
	     network.addFriendConnection(1, 2);
	     network.addFriendConnection(1, 3);
	     network.addFriendConnection(2, 3);
	     network.addFriendConnection(2, 4);

	     // Display friends
	     network.displayFriends(1);

	     // Mutual friends
	     network.findMutualFriends(1, 2);

	     // Count friends
	     network.countFriends();

	     // Remove connection
	     network.removeFriendConnection(1, 3);
	     network.displayFriends(1);
	 }
}
