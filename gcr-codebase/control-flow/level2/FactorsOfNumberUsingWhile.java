//the factors of a number using the while loop
import java.util.Scanner;

public class FactorsOfNumberUsingWhile 
	{
		public static void main(String[] args) {
		
		//scanner object
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number: ");
        	int number = sc.nextInt();

        	// check for positive number
        	if (number > 0) 
			{

            			int counter = 1;

            			// loop to find factors
            			while (counter <= number) 
					{

                				if (number % counter == 0) {
                    				System.out.println("Factor is: " + counter);
                			}

                		counter++;
            		}

        		} 
			else 
			{
            			System.out.println("Please enter a positive integer.");
        		}

        		sc.close();
    		}
	}
