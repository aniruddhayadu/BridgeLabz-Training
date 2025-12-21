
// BMI calculator
import java.util.Scanner;

public class BMICalculatorSimple {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];

	     // convert cm to meters
            double heightM = data[i][1] / 100;
            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to get BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] team = new double[10][3]; 

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Weight (kg): ");
            team[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            team[i][1] = sc.nextDouble();
        }


        // Calculate BMI
        calculateBMI(team);

        // Get BMI status
        String[] status = getBMIStatus(team);

        // Print results simply
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + team[i][0] + " kg");
            System.out.println("Height: " + team[i][1] + " cm");
            System.out.println("BMI: " + team[i][2]);
            System.out.println("Status: " + status[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
