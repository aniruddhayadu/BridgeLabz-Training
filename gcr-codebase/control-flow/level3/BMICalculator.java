// Program to calculate BMI and determine weight status
import java.util.Scanner;

public class BMICalculator
	{
    		public static void main(String[] args)
    		{
        		Scanner input = new Scanner(System.in);

        		// Input weight in kilograms
        		System.out.print("Enter weight (kg): ");
        		double weight = input.nextDouble();

        		// Input height in centimeters
        		System.out.print("Enter height (cm): ");
        		double heightCm = input.nextDouble();

        		// Convert height from cm to meters
        		double heightM = heightCm / 100;

        		// Calculate BMI
        		double bmi = weight / (heightM * heightM);

        		// Determine weight status
        		String status = "";

        		if (bmi <= 18.4)
        			{
            				status = "Underweight";
        			}
        		else if (bmi <= 24.9)
        			{
            				status = "Normal";
        			}
        		else if (bmi <= 39.9)
        			{
            				status = "Overweight";
        			}
        		else
        			{
            				status = "Obese";
        			}

        		// Display results
        		System.out.println("\nBMI: " + bmi);
        		System.out.println("Weight Status: " + status);

        		input.close();
    		}
	}
