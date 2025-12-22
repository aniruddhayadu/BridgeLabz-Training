// student score card 


import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    	// Method to generate random PCM scores for all students (2-digit scores)
    	public static int[][] generateScores(int numStudents) {
        	int[][] scores = new int[numStudents][3]; 
        	Random rand = new Random();
        	for (int i = 0; i < numStudents; i++) {
            		scores[i][0] = 10 + rand.nextInt(90);
            		scores[i][1] = 10 + rand.nextInt(90);
            		scores[i][2] = 10 + rand.nextInt(90);
        	}
        	return scores;
    	}

    	// Method to calculate total, average, and percentage
    	public static double[][] calculateTotals(int[][] scores) {
        	int numStudents = scores.length;
        	double[][] results = new double[numStudents][3]; 
	        int maxMarksPerSubject = 100;
        	int totalMaxMarks = maxMarksPerSubject * 3;

        	for (int i = 0; i < numStudents; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double average = (double) total / 3;
            		double percentage = ((double) total / totalMaxMarks) * 100;

            
            		average = Math.round(average * 100.0) / 100.0;
            		percentage = Math.round(percentage * 100.0) / 100.0;

            		results[i][0] = total;
            		results[i][1] = average;
            		results[i][2] = percentage;
        	}
        	return results;
    	}


    	// Method to display the scorecard in tabular format
    	public static void displayScorecard(int[][] scores, double[][] results) {
        	System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        	for (int i = 0; i < scores.length; i++) {
            		System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n", i + 1, scores[i][0], scores[i][1], scores[i][2], (int)results[i][0], results[i][1], results[i][2]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number of students: ");
        	int numStudents = sc.nextInt();

        	// generate random scores 
        	int[][] scores = generateScores(numStudents);

        	// Calculate total, average, and percentage
        	double[][] results = calculateTotals(scores);

        	// Display scorecard
        	displayScorecard(scores, results);

        	sc.close();
    	}
}
