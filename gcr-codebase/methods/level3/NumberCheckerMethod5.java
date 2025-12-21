import java.util.Scanner;

public class NumberCheckerMethod5 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int n = number;

        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Perfect number check
        System.out.println("Is Perfect Number? " +
                (isPerfectNumber(number) ? "Yes" : "No"));

        // Abundant number check
        System.out.println("Is Abundant Number? " +
                (isAbundantNumber(number) ? "Yes" : "No"));

        // Deficient number check
        System.out.println("Is Deficient Number? " +
                (isDeficientNumber(number) ? "Yes" : "No"));

        // Strong number check
        System.out.println("Is Strong Number? " +
                (isStrongNumber(number) ? "Yes" : "No"));

        sc.close();
    }
}
