/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results.*/

import java.util.Scanner;

public class FactorsOperations {
	
	// method to find factors and return array 
	public static int[] findFactors(int number) {	
		int count = 0;

		// count the factors
		for (int index = 1; index <= number; index++) {
			if (number % index == 0) {
				count++;
			}
		}
	
		// initialize array with count 

		int [] factors = new int [count];
		int index = 0;
	
		// storing factors in array 

		for (int i = 1; i <= number; i++) {
            		if (number % i == 0) {
                		factors[index] = i;
                		index++;
            		}
        	}
		return factors;
	}


	// method to find sum of factors
	public static int sumOfFactors(int[] factors) {
        	int sum = 0;
        	for (int factor : factors) {
            		sum += factor;
        	}
        	return sum;
    	}
 
	// Method to find product of factors
    	public static long productOfFactors(int[] factors) {
        	long product = 1;
        	for (int factor : factors) {
            		product *= factor;
        	}
        	return product;
    	}

    	// Method to find sum of squares of factors
    	public static double sumOfSquares(int[] factors) {
        	double sum = 0;
        	for (int factor : factors) {
            		sum += Math.pow(factor, 2);
        	}
		return sum;
	}


	public static void main(String[] args) {
	
		//scanner object 
        	Scanner sc = new Scanner(System.in);

        	// take user input
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Get factors array
        	int[] factors = findFactors(number);

        	// Display factors
        	System.out.println("Factors of " + number + " are:");
        	for (int factor : factors) {
            		System.out.print(factor + " ");
        	}

		System.out.println();

        	// display results
        	System.out.println("Sum of factors: " + sumOfFactors(factors));
        	System.out.println("Product of factors: " + productOfFactors(factors));
        	System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
	}
}
