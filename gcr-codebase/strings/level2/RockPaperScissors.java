//Creating a class to implement rock, paper, scissors game.

import java.util.Scanner;

public class RockPaperScissors {

	// Method to get computer choice using Math.random()
    	public static String createComputerChoice() {
        	int choice = (int) (Math.random() * 3);
        	if (choice == 0)
            		return "Rock";
        	else if (choice == 1)
            		return "Paper";
        	else
            		return "Scissors";
    	}

	// Method to find winner
    	public static String findWinner(String user, String computer) {
        	if (user.equalsIgnoreCase(computer))
            		return "Draw";

        	if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            		(user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            		(user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            		return "User";
        	} else {
            		return "Computer";
        	}
    	}

	// Method to calculate average and percentage
    	public static String[][] calculateResult(int userWins, int computerWins, int 	totalGames) {
        	String[][] status = new String[3][3];

        	status[0][0] = "Player";
        	status[0][1] = "Wins";
        	status[0][2] = "Win %";

        	status[1][0] = "User";
        	status[1][1] = String.valueOf(userWins);
        	status[1][2] = String.format("%.2f", (userWins * 100.0) / totalGames);

        	status[2][0] = "Computer";
        	status[2][1] = String.valueOf(computerWins);
        	status[2][2] = String.format("%.2f", (computerWins * 100.0) / totalGames);

        	return status;
    	}

	// Method to display game results and statistics
    	public static void displayResults(String[][] gameResults, String[][] status) {
        	System.out.println("\nGame Results:");
        	System.out.println("Game\tUser Choice\tComputer Choice\tWinner");

        	for (int i = 0; i < gameResults.length; i++) {
            		System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" +
                    	gameResults[i][1] + "\t\t" + gameResults[i][2]);
        	}

        	System.out.println("\nOverall Statistics:");
        	for (String[] row : status) {
            		System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter number of games: ");
        	int games = sc.nextInt();

        	int userWins = 0;
        	int computerWins = 0;
        	String[][] gameResults = new String[games][3];

        	for (int i = 0; i < games; i++) {
            		System.out.print("\nGame " + (i + 1) + " - Enter your choice 				(Rock/Paper/Scissors): ");
            		String userChoice = sc.next();
            		String computerChoice = createComputerChoice();
            		String winner = findWinner(userChoice, computerChoice);

            		if (winner.equals("User"))
                		userWins++;
            		else if (winner.equals("Computer"))
                		computerWins++;

            		gameResults[i][0] = userChoice;
            		gameResults[i][1] = computerChoice;
            		gameResults[i][2] = winner;
        	}

        	String[][] status = calculateResult(userWins, computerWins, games);
        	displayResults(gameResults, status);

        	sc.close();
    	}
}