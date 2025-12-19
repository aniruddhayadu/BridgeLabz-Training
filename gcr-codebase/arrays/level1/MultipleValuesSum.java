/* Program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number.*/


import java.util.Scanner;
 
class MultipleValuesSum{
 
    	public static void main(String[] args) {
		// scanner object
        	Scanner input = new Scanner(System.in);
		
		int values[]=new int[10];
		
		double sum=0;

		// taking input for numbers and calculating sum 
		System.out.println("Enter value :(Less than 1 for close the program)");

		for ( int index=0; index <10; index++) {
			values[index] = input.nextInt();
			
			if(values[index]<1|| index+1==10) {
				break;
			}
			else {
				sum+=values[index];
			}
			System.out.println("Enter next value :(Less than 1 for close the program)");
			
		}
		
		System.out.println ( "The Sum is: " +sum);
		
	}
}