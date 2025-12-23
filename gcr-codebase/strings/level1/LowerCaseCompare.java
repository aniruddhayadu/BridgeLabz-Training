//Write a program to convert the complete text to lowercase and compare the result

import java.util.Scanner;

public class LowerCaseCompare {

	// Method to convert string to lowercase 
	public static String toLowerCaseByCharAt(String text) {

		String result = "";

		for (int i = 0; i < text.length(); i++) {

			char ch = text.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		return result;
	}

	// method to compare two strings 
	public static boolean compareStrings(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking input
		System.out.println("Enter text :");
		String text = sc.nextLine();

		String lowerByMethod = toLowerCaseByCharAt(text);

		String lowerByBuiltIn = text.toLowerCase();

		// displaying results
		System.out.println("Lowercase using charAt() : " + lowerByMethod);
		System.out.println("Lowercase using toLowerCase() : " + lowerByBuiltIn);

		// comparing both strings
		System.out.println("Both strings are equal : "
				+ compareStrings(lowerByMethod, lowerByBuiltIn));

		sc.close();
	}
}
