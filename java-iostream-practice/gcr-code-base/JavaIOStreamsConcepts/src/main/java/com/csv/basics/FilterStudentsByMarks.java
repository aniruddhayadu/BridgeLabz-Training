package com.csv.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FilterStudentsByMarks {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        FilterStudentsByMarks.class
                                .getClassLoader()
                                .getResourceAsStream("data/csv/studentmarks.csv")))) {

            String line;
            boolean isHeader = true;

            System.out.println("Students with marks > 80:");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // 🔒 SAFETY CHECK
                if (data.length < 4) {
                    continue;
                }

                String id = data[0];
                String name = data[1];
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
