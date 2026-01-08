package com.runtimeanalysis;

public class StringConcatenationTest {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("Operations count: " + n);

            // Using String (immutable, slow)
            if (n <= 10000) { // Avoid very long execution for String
                long start = System.nanoTime();
                String result = "";
                for (int i = 0; i < n; i++) {
                    result += "a"; // Each concatenation creates new object
                }
                long time = System.nanoTime() - start;
                System.out.println("String: " + time / 1_000_000.0 + " ms");
            } else {
                System.out.println("String: Unusable for large N");
            }

            // Using StringBuilder (mutable, fast)
            long start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append("a");
            }
            long time = System.nanoTime() - start;
            System.out.println("StringBuilder: " + time / 1_000_000.0 + " ms");

            // Using StringBuffer (mutable, thread-safe)
            start = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sbuf.append("a");
            }
            time = System.nanoTime() - start;
            System.out.println("StringBuffer: " + time / 1_000_000.0 + " ms");

        }
    }
}
