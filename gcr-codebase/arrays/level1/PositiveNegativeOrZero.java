/*check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd*/

import java.util.Scanner;
 
public class PositiveNegativeOrZero {
 
    	public static void main(String[] args) {
		// scanner object
        	Scanner input = new Scanner(System.in);
		
		int numbers[] = new int [5];
		
		// taking input for the numbers
		System.out.println ("Enter numbers");
	
		for ( int index=0; index < numbers.length; index++) {
			numbers[index] = input.nextInt();
			}
		

		//checking positive negative or zero

		for ( int index=0; index < numbers.length; index++) {
			if(numbers [index] < 0) {
				System.out.println ( "The number "+numbers[index]+ " is negative" );
			} 
			else if (numbers [index] == 0) {
				System.out.println ( "The number is Zero" );
			} 
			else {
				if (numbers[index]%2==0) {
					System.out.println ( "The number "+numbers[index]+ " is Even number." );
				}
				else {
					System.out.println ( "The number "+numbers[index]+ " is Odd number." );
				}
			}
		}
		

		// compare the first and last elements 

		if ( numbers [0] == numbers [4] ) {
			System.out.println("The first and last numbers are equals");
		}
		else if ( numbers [0] > numbers [4] ) {
			System.out.println("The first number is greater than second number. ");
		}
		else {
			System.out.println("The first number is less than second number. ");
		}
	}
}