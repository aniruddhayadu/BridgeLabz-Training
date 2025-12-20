// program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;
public class SimpleInterest {

    // Method To calculate Simple Interest
    public double simpleInterest(double principal, double rate, double time) {
        // Calculating Simple Interest
        double result = (principal*rate*time)/100;
        // return the value
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the principal, rate, and time : ");
        double principal = sc.nextDouble();
	double rate = sc.nextDouble();
	double time = sc.nextDouble();

        // Create a SimpleInterest object
        SimpleInterest si = new SimpleInterest();

        // Call the method to calculating SI
        double resultSI = si.simpleInterest(principal,rate,time); 

        // Display value 
        System.out.println("The Simple Interest is: " + resultSI+ " for Principal "+principal+ ", Rate of Interest "+ rate+" and Time "+time);

        // Close the Scanner object
        sc.close();
    }
}
