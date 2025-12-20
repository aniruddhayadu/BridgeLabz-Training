/* Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.*/

import java.util.Scanner;

public class NaturalNumberSumRecursive {

    // method to find the sum of n natural numbers using recursion
    public static int recursiveSum(int number) {
        if (number <= 0) {
            return 0;
        } else {
            return number + recursiveSum(number - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input number
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        int formulaeSum = (number * (number + 1)) / 2;
        int methodSum = recursiveSum(number);

        // Result comparison and printing 
        System.out.println("Sum using recursive method : " + methodSum);
        System.out.println("Sum using formula : " + formulaeSum);
        System.out.println("Both sums are equal : " + (formulaeSum == methodSum));
    }
}
