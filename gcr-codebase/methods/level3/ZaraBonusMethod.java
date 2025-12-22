// zara bonus method 

import java.util.Random;

public class ZaraBonusMethod {
	

	// method to define 2D array and save random salary and year of service

	public static int[][] getRandomSalaryAndExperience(int numberOfEmployee) {
		Random rand = new Random ();
		int [][] employeeData = new int [numberOfEmployee][2];

		for (int i = 0; i < numberOfEmployee; i++) {
			employeeData[i][0] = rand.nextInt(90000)+10000;
			employeeData[i][1] = rand.nextInt(10)+1;
		}
		return employeeData;
	}

	
	// method to calculate bonus and new salary
	public static double [][] calculateBonusAndNewSalary(int employeeData[][]) {

		int noOfEmployee = employeeData.length;
		double result [][] = new double [noOfEmployee][3];	
		

		for(int i = 0; i < noOfEmployee; i++) {
			int salary = employeeData[i][0];
			int years = employeeData[i][1];

			double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            		double newSalary = salary + bonus;

            		result[i][0] = salary;
            		result[i][1] = bonus;
            		result[i][2] = newSalary;
		}
		return result;
	}

	// method to calculate sum of upadated salary, bonus, and display result 

	public static void displayResult (double result[][]) {
	
		double totalOld = 0;
		double totalBonus = 0;
		double totalNew = 0;

		
		System.out.println("Employee\tOld Salary\tBonus\tNew Salary");

		for (int i = 0; i < result.length; i++) {
            		System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\n", i+1, result[i][0], result[i][1], result[i][2]);
            		totalOld += result[i][0];
            		totalBonus += result[i][1];
            		totalNew += result[i][2];
        	}


		System.out.print("Total old salary :"+totalOld);
		System.out.print("\nTotal Bonus :"+totalBonus);
		System.out.print("\nTotal new salary :"+totalNew);
	}

	public static void main (String args[]) {
		int numEmployees = 10;

                int[][] employeeData = getRandomSalaryAndExperience(numEmployees);

                double[][] result = calculateBonusAndNewSalary(employeeData);

                displayResult(result);
	}
}

