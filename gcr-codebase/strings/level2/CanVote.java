//Creating a class to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

import java.util.Random;

public class CanVote {

    //  Generating random 2-digit ages for n students
	public static int[] generateAges(int n) {
        	int[] ages = new int[n];
        	Random r = new Random();
        	for (int i = 0; i < n; i++) {
            		// Generates ages between 10 and 99
            		ages[i] = r.nextInt(90) + 10;
        	}
        	return ages;
    	}

    // Checking voting eligibility
	public static String[][] checkVoteEligibility(int[] ages) {
        	String[][] result = new String[ages.length][2];
        	for (int i = 0; i < ages.length; i++) {
            		result[i][0] = String.valueOf(ages[i]);

            		if (ages[i] < 0) {
                		result[i][1] = "false";
            		} else if (ages[i] >= 18) {
                		result[i][1] = "true";
            		} else {
                		result[i][1] = "false";
            		}
        	}
        	return result;
    	}

	// Displaying the 2D array in tabular format
    	public static void displayResult(String[][] data) {
        	System.out.println("Age\tCan Vote");
        	System.out.println("----------------");
        	for (int i = 0; i < data.length; i++) {
            		System.out.println(data[i][0] + "\t" + data[i][1]);
        	}
    	}

	public static void main(String[] args) {
        	int students = 10;

        	int[] ages = generateAges(students);
        	String[][] votingResult = checkVoteEligibility(ages);
        	displayResult(votingResult);
    	}
}