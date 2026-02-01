package com.csv.advances;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesInCSV {

    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();
        System.out.println("Duplicate Records:");
        System.out.println("-------------------");

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        DetectDuplicatesInCSV.class
                                .getClassLoader()
                                .getResourceAsStream("data/csv/employees.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 1) continue;

                String id = data[0];

                if (ids.contains(id)) {
                    System.out.println(line);
                } else {
                    ids.add(id);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
