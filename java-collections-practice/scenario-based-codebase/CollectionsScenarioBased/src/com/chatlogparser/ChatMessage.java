package com.chatlogparser;

public class ChatMessage {

	private String time; // Timestamp
	private String user; // User name
	private String message; // Message text

	public ChatMessage(String time, String user, String message) {
		this.time = time;
		this.user = user;
		this.message = message;
	}

	public String getTime() {
		return time;
	}

	public String getUser() {
		return user;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "[" + time + "] " + message;
	}
}