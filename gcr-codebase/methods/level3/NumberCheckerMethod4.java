// Extend or Create a NumberChecker utility class and perform following task.
// Call from main() method the different methods and display results.
// Make sure all are static methods

import java.util.Scanner;

public class NumberCheckerMethod4 {

    // Method to check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    // Sum of digits of square = number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check Spy Number
    // Sum of digits = Product of digits
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int n = number;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    // Square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // Method to check Buzz Number
    // Divisible by 7 OR ends with 7
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime check
        System.out.println("Is Prime Number? " + 
                (isPrime(number) ? "Yes" : "No"));

        // Neon check
        System.out.println("Is Neon Number? " + 
                (isNeonNumber(number) ? "Yes" : "No"));

        // Spy check
        System.out.println("Is Spy Number? " + 
                (isSpyNumber(number) ? "Yes" : "No"));

        // Automorphic check
        System.out.println("Is Automorphic Number? " + 
                (isAutomorphic(number) ? "Yes" : "No"));

        // Buzz check
        System.out.println("Is Buzz Number? " + 
                (isBuzzNumber(number) ? "Yes" : "No"));

        sc.close();
    }
}
