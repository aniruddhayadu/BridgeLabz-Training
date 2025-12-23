// Write a program to demonstrate NumberFormatException

import java.util.Scanner;

public class NumberFormat {

	// Method to generate NumberFormatException
	public static void generateException(String text) {

		System.out.println(Integer.parseInt(text));
	}

	// Method to handle NumberFormatException
	public static void handleException(String text) {

		try {
			System.out.println(Integer.parseInt(text));
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught successfully");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException caught successfully");
		}
	}

	public static void main(String args[]) {

		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking user input
		System.out.println("Enter String :");
		String text = sc.next();

		// generate exception
		System.out.println("generating gxception");
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