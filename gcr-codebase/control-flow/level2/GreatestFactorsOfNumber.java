//to print the greatest factor of a number beside itself

import java.util.Scanner;
public class GreatestFactorsOfNumber 
	{

    		public static void main(String[] args) 
			{
				//scanner object
        			Scanner sc = new Scanner(System.in);

        			// enter the number
       				System.out.print("Enter number: ");
        			int number = sc.nextInt();
		
				//checking and printing the factors of number
		
				for (int i=number/2;i>=1;i--)	
					{
						if(number%i==0) 
							{
								System.out.println("Greatest factors is: "+i);
								break;
							}
					}
			}
	}