//Write a program to split the text into words, compare the result with the split() method and display the result 


import java.util.Scanner;

public class SplitStringCompare {

	// Method to find length 
	public static int findLength(String text) {

		int count = 0;
		try {
			while (true) {
				text.charAt(count);
				count++;
			}
		}
		catch (RuntimeException e) {
		}
		return count;
	}

	// Method to split text into words
	public static String[] splitByCharAt(String text) {

		int length = findLength(text);

		// count number of words
		int wordCount = 1;
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}

		// array to store words
		String[] words = new String[wordCount];

		int start = 0;
		int index = 0;

		for (int i = 0; i <= length; i++) {

			if (i == length || text.charAt(i) == ' ') {
				String word = "";

				for (int j = start; j < i; j++) {
					word += text.charAt(j);
				}
				words[index++] = word;
				start = i + 1;
			}
		}
		return words;
	}

	// Method to compare two string arrays
	public static boolean compareArrays(String[] a1, String[] a2) {

		if (a1.length != a2.length) {
			return false;
		}

		for (int i = 0; i < a1.length; i++) {
			if (!a1[i].equals(a2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking complete text input
		System.out.println("Enter text :");
		String text = sc.nextLine();

		// user-defined split
		String[] wordsByMethod = splitByCharAt(text);

		// built-in split()
		String[] wordsByBuiltIn = text.split(" ");

		// displaying words
		System.out.println("\nWords using user-defined method :");
		for (String w : wordsByMethod) {
			System.out.println(w);
		}

		System.out.println("\nWords using split() method :");
		for (String w : wordsByBuiltIn) {
			System.out.println(w);
		}

		// comparing both arrays
		System.out.println("\nBoth word arrays are equal : "
				+ compareArrays(wordsByMethod, wordsByBuiltIn));

		sc.close();
	}
}
