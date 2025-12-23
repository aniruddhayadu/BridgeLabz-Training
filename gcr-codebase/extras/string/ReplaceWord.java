import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();

		System.out.print("Enter word to replace: ");
		String oldWord = sc.nextLine();

		System.out.print("Enter new word: ");
		String newWord = sc.nextLine();

		String result = "";
		int i = 0;
		while (i < sentence.length()) {
			String temp = "";
			// Extract word
			while (i < sentence.length() && sentence.charAt(i) != ' ') {
				temp += sentence.charAt(i);
				i++;
			}

			if (temp.equals(oldWord)) {
				result += newWord;
			} else {
				result += temp;
			}

			// Add space if not end
			if (i < sentence.length()) {
				result += " ";
			}

			i++;
		}

		System.out.println("Modified Sentence: " + result);
		sc.close();
	}
}
