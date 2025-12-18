//program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

public class EvenOddUsingFor
	{
		public static void main(String[] args)
			{
				// Create a Scanner Object
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter number ");
				int number = input.nextInt();
        			
            			// printing even and odd  
	
				
				for (int i=1;i<=number;i++)
					{	
						if(i%2!=0){
							System.out.println("Odd Number :"+i);
						}
						else {
							System.out.println("Even Number :"+i);
						}
					}						
				input.close();
    			}
	}
