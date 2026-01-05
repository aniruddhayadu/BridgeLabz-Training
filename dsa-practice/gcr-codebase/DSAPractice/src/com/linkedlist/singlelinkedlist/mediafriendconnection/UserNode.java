package com.linkedlist.singlelinkedlist.mediafriendconnection;

public class UserNode {

	 int userId;
	 String name;
	 int age;
	 FriendNode friendList;   // Head of friend's linked list
	 UserNode next;

	 public UserNode(int userId, String name, int age) {
	     this.userId = userId;
	     this.name = name;
	     this.age = age;
	     this.friendList = null;
	     this.next = null;
	 }
}
