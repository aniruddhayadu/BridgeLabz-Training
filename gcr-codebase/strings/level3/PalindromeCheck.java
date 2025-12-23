import java.util.Scanner;

public class PalindromeCheck {

	// iterative method
	public static boolean isPalindromeIterative(String text) {
		int start = 0;
		int end = text.length() - 1;

		while (start < end) {
			if (text.charAt(start) != text.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	// recursive method
	public static boolean isPalindromeRecursive(String text, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (text.charAt(start) != text.charAt(end)) {
			return false;
		}
		return isPalindromeRecursive(text, start + 1, end - 1);
	}

	// Using char arrays and reverse
	public static boolean isPalindromeCharArray(String text) {
		int len = text.length();
		char[] original = text.toCharArray();
		char[] reverse = new char[len];

		// Create reversed array
		for (int i = 0; i < len; i++) {
			reverse[i] = text.charAt(len - 1 - i);
		}

		// Compare original and reverse arrays
		for (int i = 0; i < len; i++) {
			if (original[i] != reverse[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = sc.nextLine();

		
		if (isPalindromeIterative(text)) {
			System.out.println("Logic 1 (Iterative): Palindrome");
		} else {
			System.out.println("Logic 1 (Iterative): Not Palindrome");
		}

		if (isPalindromeRecursive(text, 0, text.length() - 1)) {
			System.out.println("Logic 2 (Recursive): Palindrome");
		} else {
			System.out.println("Logic 2 (Recursive): Not Palindrome");
		}

		if (isPalindromeCharArray(text)) {
			System.out.println("Logic 3 (Char Array): Palindrome");
		} else {
			System.out.println("Logic 3 (Char Array): Not Palindrome");
		}

		sc.close();
	}
}
