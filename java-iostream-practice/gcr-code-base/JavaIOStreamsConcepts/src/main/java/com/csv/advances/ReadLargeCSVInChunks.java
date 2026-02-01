package com.csv.advances;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadLargeCSVInChunks {

    public static void main(String[] args) {

        int batchSize = 100;
        int totalCount = 0;

        InputStream is = ReadLargeCSVInChunks.class
                .getClassLoader()
                .getResourceAsStream("data/csv/largefile.csv");

        // If null -> file not found
        if (is == null) {
            System.out.println("File not found! Check path.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;
            int currentBatchCount = 0;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                currentBatchCount++;
                totalCount++;

                if (currentBatchCount == batchSize) {
                    System.out.println("Processed " + totalCount + " records so far.");
                    currentBatchCount = 0;
                }
            }

            if (currentBatchCount > 0) {
                System.out.println("Processed " + totalCount + " records so far.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
