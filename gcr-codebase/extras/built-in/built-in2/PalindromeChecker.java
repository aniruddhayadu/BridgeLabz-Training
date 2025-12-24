import java.util.Scanner;

public class PalindromeChecker {

	public static boolean isPalindrome(String text) {
		int i = 0, j = text.length() - 1;
		while (i < j) {
			if (text.charAt(i) != text.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		if (isPalindrome(text)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		sc.close();
	}
}
