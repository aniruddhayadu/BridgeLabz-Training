import java.util.Random;

public class GradesCalculation {

	//Generate random 2-digit PCM scores
    	public static int[][] generateScores(int students) {
        	int[][] scores = new int[students][3];
        	Random r = new Random();
        	for (int i = 0; i < students; i++) {
            		for (int j = 0; j < 3; j++) {
                	scores[i][j] = r.nextInt(90) + 10; // 2-digit scores (10–99)
            		}
        	}
        	return scores;
    	}

    //Calculating total, average, and percentage
	public static double[][] calculateResults(int[][] scores) {
        	int students = scores.length;
        	double[][] result = new double[students][3]; 

        	for (int i = 0; i < students; i++) {
            		int totalScore = scores[i][0] + scores[i][1] + scores[i][2];
            		double average = totalScore / 3.0;
            		double percentage = (totalScore / 300.0) * 100;
            		// Rounding off to 2 decimal places
            		result[i][0] = Math.round(totalScore * 100.0) / 100.0;
            		result[i][1] = Math.round(average * 100.0) / 100.0;
            		result[i][2] = Math.round(percentage * 100.0) / 100.0;
        	}
        	return result;
    	}

	//Calculating grade based on percentage
    	public static String[][] calculateGrades(double[][] results) {
        	int students = results.length;
        	String[][] grades = new String[students][1];

        	for (int i = 0; i < students; i++) {
            		double percentage = results[i][2];

            		if (percentage >= 80)
                		grades[i][0] = "A";
            		else if (percentage >= 70 && percentage<=79)
                		grades[i][0] = "B";
            		else if (percentage >= 60 && percentage<=69)
                		grades[i][0] = "C";
            		else if (percentage >= 50 && percentage<=59)
                		grades[i][0] = "D";
            		else if (percentage >= 40 && percentage<=49)
                		grades[i][0] = "E";
            		else
                		grades[i][0] = "R";
        	}
        	return grades;
    	}

    	//Displaying scorecard
	public static void displayScoreCard(int[][] scores, double[][] results, String[][] 	grades) {
        	System.out.println("-----------------------------------------------------------------------------------");
        	System.out.printf("%-10s %-8s %-10s %-8s %-8s %-10s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        	System.out.println("-----------------------------------------------------------------------------------");

        	for (int i = 0; i < scores.length; i++) {
            		System.out.printf("%-10s %-8d %-10d %-8d %-8.2f %-10.2f %-12.2f %-6s%n",
                    	"Student " + (i + 1),
                    	scores[i][0], scores[i][1], scores[i][2],
                    	results[i][0], results[i][1], results[i][2],
                    	grades[i][0]);
        	}
        	System.out.println("-----------------------------------------------------------------------------------");
    	}

	// Main method
    	public static void main(String[] args) {
        	int totalStudents = 5;

        	int[][] scores = generateScores(totalStudents);
        	double[][] results = calculateResults(scores);
        	String[][] grades = calculateGrades(results);

        	displayScoreCard(scores, results, grades);
    	}
}