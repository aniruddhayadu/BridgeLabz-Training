//to find all the multiples of a number
import java.util.Scanner;

public class MultiplesBelowHundred 
	{

    		public static void main(String[] args) {
			//scanner object
        		Scanner sc = new Scanner(System.in);

        		System.out.print("Enter number: ");
        		int number = sc.nextInt();

        		// check number is valid
        		if (number > 0 && number < 100) {

            			// loop from 100 to 1
            		for (int i = 100; i >= 1; i--) {

                		if (i % number == 0) {
                    		System.out.println(i);
                		}
            		}

        		} 
			else {
            			System.out.println("Enter a positive number less than 100.");
        		}

       	 		sc.close();
    		}
	}
