/*Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.*/

import java.util.Scanner;

public class FactorialUsingWhile
	{
		public static void main(String[] args)
			{
				// Create a Scanner Object
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter number ");
				int number = input.nextInt();
        			
            			// computing factorial 
	
				int factorial=1;
				while(number>0)
					{	
						factorial=factorial*number;
						number--;
					}
						
				System.out.println("Factorial of Number is :"+factorial);
				input.close();
    			}
	}
