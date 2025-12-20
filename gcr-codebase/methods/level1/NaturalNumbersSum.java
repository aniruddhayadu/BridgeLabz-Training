//  a program to calculate sum of natural number

import java.util.Scanner;
public class NaturalNumbersSum {
	
    // Method to calculate sum of natural numbers
    public int sumOfNaturalNumbers (int number) {
        
        // checking number
	if (number>0) {
	    int sum = 0;

	    // calculating sum 
	    for (int index=0; index <= number; index++) {
		sum+=index;
	    }
	    return sum;
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
	

        // Create a NaturalNumbersSum object
        NaturalNumbersSum obj = new NaturalNumbersSum();

        // Call the method to calculate sum of natural number
        int sum = obj.sumOfNaturalNumbers(number); 


        // Display value 
        System.out.println("The sum of natural number is: " +sum);

        // Close the Scanner object
        sc.close();
    }
}
