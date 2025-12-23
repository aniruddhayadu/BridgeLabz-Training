// bmi calculation level3 1st 

import java.util.Scanner;

public class StringBMICalculator {

    	// method to find BMI and Status of one person
    	public static String[] findBMI(double weight, double heightCm) {

        	double heightM = heightCm / 100;  
        	double bmi = weight / (heightM * heightM);

        	String status;
        	if (bmi < 18.5) {
            		status = "Underweight";
        	} 
		else if (bmi < 25) {
            		status = "Normal";
        	} 
		else if (bmi < 30) {
            		status = "Overweight";
        	} 
		else {
            		status = "Obese";
        	}

        	String[] result = new String[2];
        	result[0] = String.valueOf(bmi);
        	result[1] = status;

        	return result;
    	}

    	// method to calculate BMI
    	public static String[][] calculateTeamBMI(double[][] data) {

        	String[][] result = new String[10][4];

        	for(int i = 0; i < 10; i++) {

            	double weight = data[i][0];
            	double height = data[i][1];

            	String[] bmiData = findBMI(weight, height);

            	result[i][0] = String.valueOf(height);
            	result[i][1] = String.valueOf(weight);
            	result[i][2] = bmiData[0];
            	result[i][3] = bmiData[1];
        	}

        	return result;
    	}

    	// method to display result
    	public static void display(String[][] result) {

        	System.out.println("Height\tWeight\tBMI\tStatus");

        	for (int i = 0; i < 10; i++) {
            		System.out.println(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
        	}
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	double[][] arr = new double[10][2];

        	// Taking input
        	for (int i = 0; i < 10; i++) {
            		System.out.println("Person " + (i + 1));
            		System.out.print("Weight (kg): ");
            		arr[i][0] = sc.nextDouble();
            		System.out.print("Height (cm): ");
            		arr[i][1] = sc.nextDouble();
        	}

        	// Calculate and display BMI
        	String[][] result = calculateTeamBMI(arr);
        	display(result);

        	sc.close();
    	}
}
