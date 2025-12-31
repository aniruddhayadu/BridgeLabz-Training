/* Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking.
*/

import java.util.Scanner;

public class QuizApplication {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// Questions array
		String[] questions = {
			"1. What is the capital of India?",
			"2. Which language is used for Android development?",
			"3. Which keyword is used to inherit a class in Java?",
			"4. What is the size of int in Java?",
			"5. Which company developed Java?"
		};

		// Options array
		String[][] options = {
			{"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"},
			{"A. Python", "B. Java", "C. C++", "D. Ruby"},
			{"A. this", "B. super", "C. extends", "D. implements"},
			{"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends"},
			{"A. Google", "B. Microsoft", "C. Sun Microsystems", "D. Apple"}
		};

		// Correct answers
		char[] answers = {'B', 'B', 'C', 'B', 'C'};

		int score = 0;

		// Quiz loop
		for (int i = 0; i < 5; i++) {

			System.out.println(questions[i]);

			for (int j = 0; j < 4; j++) {
				System.out.println(options[i][j]);
			}

			System.out.print("Enter your answer (A/B/C/D): ");
			char userAnswer = sc.next().toUpperCase().charAt(0);

			// Switch for answer checking
			switch (userAnswer) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
					if (userAnswer == answers[i]) {
						System.out.println("Correct Answer");
						score++;
					} else {
						System.out.println("Wrong Answer");
					}
					break;
				default:
					System.out.println("Invalid Option");
			}

			System.out.println();
		}

		// Final score
		System.out.println("Quiz Completed");
		System.out.println("Your Score: " + score + "/5");

		sc.close();
	}
}
