// Program to check whether a number is an Abundant Number or not
import java.util.Scanner;

public class AbundantNumber
	{
    		public static void main(String[] args)
    			{
        			Scanner sc = new Scanner(System.in);

        			// Get input number
        			System.out.print("Enter a number: ");
        			int number = sc.nextInt();

        			// Variable to store sum of divisors
        			int sum = 0;

        			// Find all divisors except the number itself
        			for (int i = 1; i < number; i++)
        				{
            					if (number % i == 0)
            						{
                						sum = sum + i;
            						}
        				}

        			// Check if number is Abundant or not
        			if (sum > number)
        				{
            					System.out.println(number + " is an Abundant Number");
        				}
        			else
        				{
            					System.out.println(number + " is not an Abundant Number");
        				}

        			sc.close();
    			}
	}
