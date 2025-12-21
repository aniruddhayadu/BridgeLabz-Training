// Write a program Quadratic to find the roots of the equation ax2+ bx + c.

import java.util.Scanner;

public class Quadratic {

    // method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // no real roots
            return new double[]{};  
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input a, b, c
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // find roots
        double[] roots = findRoots(a, b, c);

        // print roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }

        sc.close();
    }
}
