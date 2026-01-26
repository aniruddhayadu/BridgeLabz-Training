package com.exceptions;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Take first integer input
			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();

			// Take second integer input
			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();

			// Perform division
			int result = num1 / num2;

			// Print result if no exception
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			// Handles division by zero
			System.out.println("Error: Cannot divide by zero");

		} finally {
			// Always executed block
			System.out.println("Operation completed");
			sc.close(); // Close resource
		}
	}
}
