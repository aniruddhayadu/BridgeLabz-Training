package com.bagandball;

import java.util.ArrayList;
import java.util.List;

// Main application class
public class BagBallApp {

	public static void main(String[] args) {

		// Create bag objects
		Bag bag1 = new Bag("BAG101", "Red", 2);
		Bag bag2 = new Bag("BAG102", "Blue", 3);

		// Create ball objects
		Ball ball1 = new Ball("BALL1", "Yellow", "Small");
		Ball ball2 = new Ball("BALL2", "Green", "Medium");
		Ball ball3 = new Ball("BALL3", "Red", "Large");

		// Add balls to bags
		bag1.addBall(ball1);
		bag1.addBall(ball2);
		bag1.addBall(ball3); // Exceeds capacity

		bag2.addBall(ball3);

		// Display balls in bags
		bag1.displayBalls();
		bag2.displayBalls();

		// Remove a ball from bag1
		bag1.removeBall("BALL1");

		// Display updated bag contents
		bag1.displayBalls();

		// Store all bags in a list
		List<Bag> bags = new ArrayList<>();
		bags.add(bag1);
		bags.add(bag2);

		// Display bag summary
		System.out.println("\n All Bags Summary:");
		for (Bag bag : bags) {
			System.out.println(
					"Bag ID: " + bag.getId() + ", Color: " + bag.getColor() + ", Ball Count: " + bag.getBallCount());
		}
	}
}
