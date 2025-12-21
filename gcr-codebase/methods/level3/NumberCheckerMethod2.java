// Extend or Create a NumberChecker utility class and perform following task.


import java.util.Scanner;

public class NumberCheckerMethod2 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = number;

        if (n == 0) {
            return 1;
        }

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


    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }



    // Method to find sum of squares of digits using digits array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }


    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }


    // Method to find frequency of each digit
   
    public static int [][] digitFrequency(int[] digits) {
	int [][] freq =new int[10][2];

	// digit column
	for(int i = 0; i < 10; i++) {
	    freq[i][0] = i;
	    freq[i][1] = 0;
	}

	// count frequency
	for (int d : digits) {
	    freq[d][1]++;
	}
	return freq;
    }

    public static void main(String[] args) {

        // Scanner object
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

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Harshad number check
        System.out.println("Is Harshad Number? " + 
                (isHarshadNumber(number, digits) ? "Yes" : "No"));

        // Digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "       " + frequency[i][1]);
            }
        }

        sc.close();
    }
}
