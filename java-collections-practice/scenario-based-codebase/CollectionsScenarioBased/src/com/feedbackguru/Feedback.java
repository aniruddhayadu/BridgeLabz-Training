package com.feedbackguru;

public class Feedback<T> {

	private T type; // Feedback type (Service/Product)
	private String message; // Feedback text
	private int rating; // Extracted rating

	// Constructor to initialize feedback object
	public Feedback(T type, String message, int rating) {
		this.type = type;
		this.message = message;
		this.rating = rating;
	}

	// Returns rating
	public int getRating() {
		return rating;
	}

	// Returns feedback message
	public String getMessage() {
		return message;
	}

	// Converts feedback object to string
	@Override
	public String toString() {
		return "[" + type + "] " + message + " (Rating: " + rating + ")";
	}
}