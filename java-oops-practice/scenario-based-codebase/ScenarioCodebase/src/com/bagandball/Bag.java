package com.bagandball;

import java.util.ArrayList;
import java.util.List;

// Bag class represents a storage bag
public class Bag implements Storable {

	// Private fields for encapsulation
	private String id;
	private String color;
	private int capacity;

	// Composition: Bag has-a list of balls
	private List<Ball> balls;

	// Constructor to initialize bag
	public Bag(String id, String color, int capacity) {
		this.id = id; // Assign bag ID
		this.color = color; // Assign bag color
		this.capacity = capacity; // Assign bag capacity
		this.balls = new ArrayList<>(); // Initialize ball list
	}

	// Getter for bag ID
	@Override
	public String getId() {
		return id;
	}

	// Getter for bag color
	@Override
	public String getColor() {
		return color;
	}

	// Method to add a ball to the bag
	public void addBall(Ball ball) {

		// Check if bag is full
		if (balls.size() >= capacity) {
			System.out.println("Bag is full. Cannot add ball: " + ball.getId());
			return;
		}

		// Add ball to bag
		balls.add(ball);
		System.out.println("Ball added: " + ball.getId());
	}

	// Method to remove a ball using ball ID
	public void removeBall(String ballId) {

		// Loop through balls in the bag
		for (Ball ball : balls) {

			// Check if ID matches
			if (ball.getId().equals(ballId)) {
				balls.remove(ball); // Remove ball
				System.out.println("Ball removed: " + ballId);
				return;
			}
		}

		// If ball not found
		System.out.println("Ball not found: " + ballId);
	}

	// Method to display all balls in the bag
	public void displayBalls() {

		System.out.println("\nBalls in Bag " + id + ":");

		// Check if bag is empty
		if (balls.isEmpty()) {
			System.out.println("No balls in this bag.");
			return;
		}

		// Print each ball
		for (Ball ball : balls) {
			System.out.println(ball);
		}
	}

	// Returns number of balls in the bag
	public int getBallCount() {
		return balls.size();
	}
}
