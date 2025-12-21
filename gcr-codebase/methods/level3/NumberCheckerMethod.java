// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Scanner;

public class NumberCheckerMethod {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }



    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int digitsCount = countDigits(number);
        int[] digits = new int[digitsCount];
        int n = number;
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }



    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }



    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        int originalNumber = 0;
        for (int d : digits) {
            originalNumber = originalNumber * 10 + d;
        }
        return sum == originalNumber;
    }



    // Method to find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }



    // Method to find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    

    public static void main(String[] args) {

	// scanner object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();


        // Count digits
        int digitsCount = countDigits(number);
        System.out.println("Number of digits: " + digitsCount);



        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }


        System.out.println();



        // Duck number check
        System.out.println("Is Duck number? " + (isDuckNumber(digits) ? "Yes" : "No"));



        // Armstrong check
        System.out.println("Is Armstrong number? " + (isArmstrong(digits) ? "Yes" : "No"));



        // Largest and second largest
        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);



        // Smallest and second smallest
        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);


        sc.close();
    }
}
