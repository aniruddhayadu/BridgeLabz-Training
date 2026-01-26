package com.exceptions.custom;

class InvalidAgeException extends Exception {

	// Constructor with custom message
	public InvalidAgeException(String message) {
		super(message);
	}
}
