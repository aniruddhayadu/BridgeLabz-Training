//Write a program to find the frequency of characters in a string using nested loops and display the result


import java.util.Scanner;

public class CharFrequencyNested {

	// method to find frequency of characters using nested loops
	public static String[][] findFrequency(String text) {

		char[] chars = text.toCharArray();
		int len = chars.length;
		int[] freq = new int[len];

		// Initialize frequency array
		for (int i = 0; i < len; i++) {
			freq[i] = 1;
		}

		// Nested loops to count frequency
		for (int i = 0; i < len; i++) {
			if (chars[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < len; j++) {
				if (chars[i] == chars[j]) {
					freq[i]++;
					chars[j] = '0'; // mark duplicate as counted
				}
			}
		}

		// Count unique characters for result array
		int uniqueCount = 0;
		for (int i = 0; i < len; i++) {
			if (chars[i] != '0') {
				uniqueCount++;
			}
		}

		// Create 2D array to store character and frequency
		String[][] result = new String[uniqueCount][2];
		int index = 0;

		for (int i = 0; i < len; i++) {
			if (chars[i] != '0') {
				result[index][0] = String.valueOf(chars[i]);
				result[index][1] = String.valueOf(freq[i]);
				index++;
			}
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

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		String[][] freqArray = findFrequency(text);
		displayFrequency(freqArray);

		sc.close();
	}
}
