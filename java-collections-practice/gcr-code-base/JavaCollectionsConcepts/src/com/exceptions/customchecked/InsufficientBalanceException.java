package com.exceptions.customchecked;

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
