package com.bagandball;

public class Ball implements Storable {

	// Private fields for encapsulation
	private String id;
	private String color;
	private String size; // small, medium, large

	// Constructor to initialize ball object
	public Ball(String id, String color, String size) {
		this.id = id; // Assign ball ID
		this.color = color; // Assign ball color
		this.size = size; // Assign ball size
	}

	// Getter for ball ID
	@Override
	public String getId() {
		return id;
	}

	// Getter for ball color
	@Override
	public String getColor() {
		return color;
	}

	// Getter for ball size
	public String getSize() {
		return size;
	}

	// Returns string representation of Ball
	@Override
	public String toString() {
		return "Ball [ID=" + id + ", Color=" + color + ", Size=" + size + "]";
	}
}
