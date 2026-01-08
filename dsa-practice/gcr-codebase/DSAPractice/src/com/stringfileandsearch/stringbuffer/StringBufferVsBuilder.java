package com.stringfileandsearch.stringbuffer;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 1_000_000; // Number of strings to append
        String str = "hello";

        // Using StringBuffer
        
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuffer.append(str);
        }

        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        System.out.println("Time taken by StringBuffer: " + timeBuffer / 1_000_000 + " ms");

        // Using StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuilder.append(str);
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        System.out.println("Time taken by StringBuilder: " + timeBuilder / 1_000_000 + " ms");
    }
}

