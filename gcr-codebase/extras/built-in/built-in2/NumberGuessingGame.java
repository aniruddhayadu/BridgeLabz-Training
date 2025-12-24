import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static int getGuess(int low, int high) {
		Random rand = new Random();
		return rand.nextInt(high - low + 1) + low;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int low = 1, high = 100;
		String feedback = "";
		int guess;

		System.out.println("Think of a number between 1 and 100.");
		
		while (true) {
			guess = getGuess(low, high);
			System.out.println("Computer guesses: " + guess);
			System.out.print("Enter feedback (high/low/correct): ");
			feedback = sc.nextLine();

			if (feedback.equalsIgnoreCase("correct")) {
				System.out.println("Computer guessed your number!");
				break;
			} else if (feedback.equalsIgnoreCase("high")) {
				high = guess - 1;
			} else if (feedback.equalsIgnoreCase("low")) {
				low = guess + 1;
			}
		}

		sc.close();
	}
}
