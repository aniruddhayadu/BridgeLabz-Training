package com.runtimeanalysis;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Path to your large file

        System.out.println("Reading file: " + filePath);

        // Using FileReader
        try (FileReader fr = new FileReader(filePath)) {
            long start = System.nanoTime();
            int c;
            while ((c = fr.read()) != -1) {
                // Just read, do nothing
            }
            long time = System.nanoTime() - start;
            System.out.println("FileReader: " + time / 1_000_000.0 + " ms");
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }

        // Using InputStreamReader
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            long start = System.nanoTime();
            int c;
            while ((c = isr.read()) != -1) {
                // Just read, do nothing
            }
            long time = System.nanoTime() - start;
            System.out.println("InputStreamReader: " + time / 1_000_000.0 + " ms");
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
    }
}

