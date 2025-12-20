// A program to take 2 numbers and print their quotient and reminder.

import java.util.Scanner;
public class RemainderAndQuotient {
	
    // Method to find the reminder and the quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number/divisor;
	int reminder = number%divisor;


	return new int[] {quotient, reminder};

    }


    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number and divisor
        System.out.print("Enter number and divisor : ");
        int number = sc.nextInt();
	int divisor = sc.nextInt();
	
	// Call the method and Display value 
	int [] result = findRemainderAndQuotient(number,divisor);
        
        System.out.println("The quotient is: "+result[0]);
	System.out.println("The reminder is: "+result[1]);
	
        // Close the Scanner object
        sc.close();
    }
}
