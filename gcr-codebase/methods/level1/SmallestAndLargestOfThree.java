// A program to find the smallest and the largest of the 3 numbers.

import java.util.Scanner;
public class SmallestAndLargestOfThree {
	
    // method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = Math.min (Math.min (number1, number2), number3);
	int largest = Math.max (Math.max (number1, number2), number3);


	return new int[] {smallest, largest};

    }



    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number 

        System.out.print("Enter numbers : ");
        int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	
	// Call the method and Display value 
	int [] result = findSmallestAndLargest(number1, number2, number3);
        
        System.out.println("The Smallest is: "+result[0]);
	System.out.println("The Largest is: "+result[1]);
	
        // Close the Scanner object
        sc.close();
    }
}
