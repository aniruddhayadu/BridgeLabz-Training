package com.runtimeanalysis;

public class FibonacciComparison {

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci 
    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("Fibonacci N = " + n);

            // Recursive 
            if (n <= 30) {
                long start = System.nanoTime();
                long result = fibonacciRecursive(n);
                long time = System.nanoTime() - start;
                System.out.println("Recursive: Result = " + result + ", Time = " + time / 1_000_000.0 + " ms");
            } else {
                System.out.println("Recursive: Unfeasible for N > 30");
            }

            long start = System.nanoTime();
            long resultIter = fibonacciIterative(n);
            long timeIter = System.nanoTime() - start;
            System.out.println("Iterative: Result = " + resultIter + ", Time = " + timeIter / 1_000_000.0 + " ms");
        }
    }
}

