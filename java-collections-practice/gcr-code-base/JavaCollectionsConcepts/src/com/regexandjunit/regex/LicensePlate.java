package com.regexandjunit.regex;

import java.util.Scanner;

public class LicensePlate {

	// Method to validate license plate
	public static boolean isValidPlate(String plate) {

		// Regex for license plate format
		String regex = "^[A-Z]{2}[0-9]{4}$";

		// Match plate with regex
		return plate.matches(regex);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take license plate input
		System.out.print("Enter license plate number: ");
		String plate = sc.nextLine();

		// Validate and print result
		if (isValidPlate(plate)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		sc.close();
	}
}
