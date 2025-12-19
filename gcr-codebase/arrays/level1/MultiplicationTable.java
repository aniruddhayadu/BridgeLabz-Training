// a program to print a multiplication table of a number

import java.util.Scanner;
 
class MultiplicationTable {
 
    	public static void main(String[] args) {
		// scanner object
        	Scanner input = new Scanner(System.in);
		
		// taking input for the number
		int number = input.nextInt();

	
		int table[] = new int [10];
				
		// inserting table into table array
		for ( int index=0; index < 10; index++) {
			table[index]=(index+1)*number;
		}
		
		// printing the table 
		for ( int index=0; index < 10; index++) {
			System.out.println("number*"+(index+1)+ " = "+table[index]);
		}
	}
}