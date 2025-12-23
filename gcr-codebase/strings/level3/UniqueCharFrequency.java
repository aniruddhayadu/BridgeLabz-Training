//Write a program to find the frequency of characters in a string using unique characters and display the result


import java.util.Scanner;

public class UniqueCharFrequency {

	// method to find unique characters
	public static char[] uniqueCharacters(String text) {

		int len = text.length();
		char[] temp = new char[len];
		int index = 0;

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			boolean isUnique = true;

			for (int j = 0; j < i; j++) {
				if (ch == text.charAt(j)) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				temp[index] = ch;
				index++;
			}
		}

		char[] result = new char[index];
		for (int i = 0; i < index; i++) {
			result[i] = temp[i];
		}

		return result;
	}

	// method to find frequency of characters using unique characters
	public static String[][] charFrequency(String text) {

		int[] freq = new int[256];
		int len = text.length();

		// Count frequency of each character
		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			freq[ch]++;
		}

		// Get unique characters
		char[] uniqueChars = uniqueCharacters(text);

		// Create 2D array for character and frequency
		String[][] result = new String[uniqueChars.length][2];

		for (int i = 0; i < uniqueChars.length; i++) {
			char ch = uniqueChars[i];
			result[i][0] = String.valueOf(ch);
			result[i][1] = String.valueOf(freq[ch]);
		}

		return result;
	}

	// method to display character frequencies
	public static void displayFrequency(String[][] freqArray) {
		System.out.println("Character\tFrequency");
		for (int i = 0; i < freqArray.length; i++) {
			System.out.println(freqArray[i][0] + "\t\t" + freqArray[i][1]);
		}
	}

	public static void main(String[] args) {

		//scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		String[][] freqArray = charFrequency(text);
		displayFrequency(freqArray);

		sc.close();
	}
}
