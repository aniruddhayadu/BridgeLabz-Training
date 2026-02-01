package com.lambdaexpressions.notificationfiltering;

public class Alert {
	private String type;
	private String message;
	
	public Alert(String type, String message) {
		this.type = type;
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Alert [type=" + type + ", message=" + message + "]";
	}
}
