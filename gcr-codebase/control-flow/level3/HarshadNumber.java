// Program to check whether a number is a Harshad Number or not
import java.util.Scanner;

public class HarshadNumber
	{
    		public static void main(String[] args)
    			{
        			Scanner sc = new Scanner(System.in);

        			// Get input number
        			System.out.print("Enter a number: ");
        			int number = sc.nextInt();

        			int originalNumber = number;
        			int sum = 0;

        			// Loop to get sum of digits
        			while (originalNumber != 0)
        				{
            					int digit = originalNumber % 10;
            					sum = sum + digit;
            					originalNumber = originalNumber / 10;
        				}

        			// Check if number is divisible by sum of digits
        			if (number % sum == 0)
        				{
            					System.out.println(number + " is a Harshad Number");
        				}
        			else
        				{
            					System.out.println(number + " is not a Harshad Number");
        				}

        			sc.close();
    			}
	}
