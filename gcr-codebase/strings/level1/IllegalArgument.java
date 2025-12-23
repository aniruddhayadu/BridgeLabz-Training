// Write a program to demonstrate IllegalArgumentException

import java.util.Scanner;

public class IllegalArgument {

	// Method to generate IllegalArgumentException
	public static void generateException(String text) {

		int startIndex = 5;
		int endIndex = 2;

		System.out.println(text.substring(startIndex, endIndex));
	}

	// Method to handle IllegalArgumentException
	public static void handleException(String text) {

		int startIndex = 5;
		int endIndex = 2;

		try {

			System.out.println(text.substring(startIndex, endIndex));
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught successfully");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException caught");
		}
	}

	public static void main(String args[]) {

		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking user input
		System.out.println("Enter a String :");
		String text = sc.next();

		// generate exception
		System.out.println("generating exception");

		try {
			generateException(text);
		}
		catch (RuntimeException e) {
			System.out.println("Exception occurred");
		}

		// handling exception
		System.out.println("handling exception");
		handleException(text);

		sc.close();
	}
}

