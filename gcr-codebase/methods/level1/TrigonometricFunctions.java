/* A program to calculate various trigonometric functions using Math class given an angle in degrees */

import java.util.Scanner;
public class TrigonometricFunctions {
	
    // Method to calculate various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
	double radians = angle*(3.14/180);
	double sine = Math.sin(radians);
	double cosine = Math.cos(radians);
	double tangent = Math.tan(radians);
	return new double []{radians, sine, cosine, tangent};
    }


    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for Angle      	
	System.out.print("Enter Angle : ");
        double angle = sc.nextDouble();
	
	// creating object TrigonometricFunctions
	TrigonometricFunctions obj = new TrigonometricFunctions();

	// Call the method and Display value 
	double []tignometricFunctions = obj.calculateTrigonometricFunctions(angle);
        
       	System.out.println("Radians : "+tignometricFunctions[0]);
	System.out.println("sine : "+tignometricFunctions[1]);
	System.out.println("cosine : "+tignometricFunctions[2]);
	System.out.println("tangent : "+tignometricFunctions[3]);

	
        // Close the Scanner object
        sc.close();
    }
}
