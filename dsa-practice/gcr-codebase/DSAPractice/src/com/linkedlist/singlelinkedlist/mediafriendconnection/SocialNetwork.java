package com.linkedlist.singlelinkedlist.mediafriendconnection;

public class SocialNetwork {

	 private UserNode head;



	 // Add a new user
	 public void addUser(int id, String name, int age) {
	     UserNode newUser = new UserNode(id, name, age);
	     newUser.next = head;
	     head = newUser;
	 }

	 // Search user by ID
	 public UserNode searchById(int id) {
	     UserNode temp = head;
	     while (temp != null) {
	         if (temp.userId == id)
	             return temp;
	         temp = temp.next;
	     }
	     return null;
	 }

	 // Search user by Name
	 public UserNode searchByName(String name) {
	     UserNode temp = head;
	     while (temp != null) {
	         if (temp.name.equalsIgnoreCase(name))
	             return temp;
	         temp = temp.next;
	     }
	     return null;
	 }



	 // Add friend connection (bidirectional)
	 public void addFriendConnection(int userId1, int userId2) {
	     UserNode user1 = searchById(userId1);
	     UserNode user2 = searchById(userId2);

	     if (user1 == null || user2 == null) {
	         System.out.println("User not found");
	         return;
	     }

	     addFriend(user1, userId2);
	     addFriend(user2, userId1);

	     System.out.println("Friend connection added");
	 }

	 // Helper to add friend to a user's list
	 private void addFriend(UserNode user, int friendId) {
	     FriendNode newFriend = new FriendNode(friendId);
	     newFriend.next = user.friendList;
	     user.friendList = newFriend;
	 }

	 // Remove friend connection (bidirectional)
	 public void removeFriendConnection(int userId1, int userId2) {
	     UserNode user1 = searchById(userId1);
	     UserNode user2 = searchById(userId2);

	     if (user1 == null || user2 == null) {
	         System.out.println("User not found");
	         return;
	     }

	     removeFriend(user1, userId2);
	     removeFriend(user2, userId1);

	     System.out.println("Friend connection removed");
	 }

	 // Helper to remove friend
	 private void removeFriend(UserNode user, int friendId) {
	     FriendNode temp = user.friendList;

	     if (temp == null) return;

	     if (temp.friendId == friendId) {
	         user.friendList = temp.next;
	         return;
	     }

	     while (temp.next != null && temp.next.friendId != friendId) {
	         temp = temp.next;
	     }

	     if (temp.next != null)
	         temp.next = temp.next.next;
	 }



	 // Display all friends of a user
	 public void displayFriends(int userId) {
	     UserNode user = searchById(userId);

	     if (user == null) {
	         System.out.println("User not found");
	         return;
	     }

	     System.out.println("Friends of " + user.name + ":");
	     FriendNode temp = user.friendList;

	     if (temp == null) {
	         System.out.println("No friends");
	         return;
	     }

	     while (temp != null) {
	         System.out.println("Friend ID: " + temp.friendId);
	         temp = temp.next;
	     }
	 }

	 // Count number of friends for each user
	 public void countFriends() {
	     UserNode temp = head;

	     while (temp != null) {
	         int count = 0;
	         FriendNode f = temp.friendList;

	         while (f != null) {
	             count++;
	             f = f.next;
	         }

	         System.out.println(temp.name + " has " + count + " friends");
	         temp = temp.next;
	     }
	 }



	 // Find mutual friends between two users
	 public void findMutualFriends(int userId1, int userId2) {
	     UserNode user1 = searchById(userId1);
	     UserNode user2 = searchById(userId2);

	     if (user1 == null || user2 == null) {
	         System.out.println("User not found");
	         return;
	     }

	     System.out.println("Mutual Friends:");
	     FriendNode f1 = user1.friendList;
	     boolean found = false;

	     while (f1 != null) {
	         FriendNode f2 = user2.friendList;

	         while (f2 != null) {
	             if (f1.friendId == f2.friendId) {
	                 System.out.println("Friend ID: " + f1.friendId);
	                 found = true;
	             }
	             f2 = f2.next;
	         }
	         f1 = f1.next;
	     }

	     if (!found)
	         System.out.println("No mutual friends");
	 }
}
