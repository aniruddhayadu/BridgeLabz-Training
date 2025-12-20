//  a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class PositiveNegativeOrZeroMethod {
	
    // Method to checking zero, negative and positive
    public int checkingNumber(int number) {
        
        if(number == 0) {
	    return 0;
	}
	else if (number > 0) {
	    return 1;
	}
	else {
	    return -1;
	}
    }



    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number 
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
	

        // Create a PositiveNegativeOrZero object
        PositiveNegativeOrZeroMethod obj = new PositiveNegativeOrZeroMethod();



        // Call the method to checking zero, negative and positive
        int result = obj.checkingNumber(number); 



        // Display value 
        System.out.println("The number is: " +result);

        // Close the Scanner object
        sc.close();
    }
}
