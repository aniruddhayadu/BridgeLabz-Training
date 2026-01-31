package com.regexandjunit.regex;

import java.util.Scanner;

public class UsernameValidator {

	// Method to validate username
	public static boolean isValidUsername(String username) {

		// Regex for username validation
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

		// Match username with regex
		return username.matches(regex);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take username input
		System.out.print("Enter username: ");
		String username = sc.nextLine();

		// Validate and print result
		if (isValidUsername(username)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		sc.close();
	}
}
