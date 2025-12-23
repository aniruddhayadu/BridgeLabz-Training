import java.util.Scanner;

public class MostFrequentCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		int[] freq = new int[256]; // ASCII

		for (int i = 0; i < text.length(); i++) {
			freq[text.charAt(i)]++;
		}

		int max = 0;
		char result = ' ';
		for (int i = 0; i < 256; i++) {
			if (freq[i] > max) {
				max = freq[i];
				result = (char) i;
			}
		}

		System.out.println("Most Frequent Character: '" + result + "'");
		sc.close();
	}
}
