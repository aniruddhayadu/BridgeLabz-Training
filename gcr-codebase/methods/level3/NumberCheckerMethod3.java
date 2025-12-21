import java.util.Scanner;

public class NumberCheckerMethod3 {

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reverse = new int[digits.length];
        int index = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reverse[index++] = digits[i];
        }
        return reverse;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check palindrome number using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number
    // A duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Reverse digits array
        int[] reversed = reverseDigitsArray(digits);
        System.out.print("Reversed digits array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Compare original and reversed arrays
        System.out.println("Are both arrays equal? " + 
                (compareArrays(digits, reversed) ? "Yes" : "No"));

        // Palindrome check
        System.out.println("Is Palindrome Number? " + 
                (isPalindrome(digits) ? "Yes" : "No"));

        // Duck number check
        System.out.println("Is Duck Number? " + 
                (isDuckNumber(digits) ? "Yes" : "No"));

        sc.close();
    }
}
