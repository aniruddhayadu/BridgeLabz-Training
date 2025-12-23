import java.util.Scanner;

public class CharFrequency {

	// method to find frequency of characters
	public static String[][] findFrequency(String text) {

		int[] freq = new int[256];  
		int len = text.length();

		// Count frequency of each character
		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			freq[ch]++;
		}

		// Count how many unique characters exist
		int uniqueCount = 0;
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				uniqueCount++;
			}
		}

		// Create 2D array to store character and frequency
		String[][] result = new String[uniqueCount][2];
		int index = 0;

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			if (freq[ch] != 0) {
				result[index][0] = String.valueOf(ch);
				result[index][1] = String.valueOf(freq[ch]);
				freq[ch] = 0; // mark as counted
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

		// scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		String[][] freqArray = findFrequency(text);
		displayFrequency(freqArray);

		sc.close();
	}
}
