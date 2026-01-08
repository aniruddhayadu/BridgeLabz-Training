package com.stringfileandsearch;

import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        // ===== StringBuilder vs StringBuffer =====
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder time: " + (endBuilder - startBuilder) / 1_000_000 + " ms");

        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer time: " + (endBuffer - startBuffer) / 1_000_000 + " ms");

        // ===== FileReader vs InputStreamReader =====
        String filePath = "largeFile.txt"; // replace with your large file
        int wordCount = 0;

        // Using FileReader
        try {
            long startFileReader = System.nanoTime();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

            reader.close();
            fileReader.close();
            long endFileReader = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount);
            System.out.println("FileReader time: " + (endFileReader - startFileReader) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }

        // Using InputStreamReader
        wordCount = 0;
        try {
            long startInputStream = System.nanoTime();
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader reader = new BufferedReader(isr);

            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

            reader.close();
            isr.close();
            fis.close();
            long endInputStream = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount);
            System.out.println("InputStreamReader time: " + (endInputStream - startInputStream) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
    }
}

