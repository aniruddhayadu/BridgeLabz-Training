package com.onlineticketbooking;

public class EventNode {

	int startTime; // event start time (e.g. 1400 = 2 PM)
	String eventName; // event name
	int height; // height for AVL balancing

	EventNode left; // left child
	EventNode right; // right child

	// Constructor
	EventNode(int startTime, String eventName) {
		this.startTime = startTime;
		this.eventName = eventName;
		this.height = 1;
	}
}
