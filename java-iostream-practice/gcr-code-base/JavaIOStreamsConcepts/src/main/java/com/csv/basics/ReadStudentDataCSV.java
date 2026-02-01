package com.csv.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStudentDataCSV {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        ReadStudentDataCSV.class
                                .getClassLoader()
                                .getResourceAsStream("data/csv/students.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // safety check
                if (data.length < 4) {
                    continue;
                }

                String id = data[0];
                String name = data[1];
                String age = data[2];
                String marks = data[3];

                System.out.println("Student ID   : " + id);
                System.out.println("Name         : " + name);
                System.out.println("Age          : " + age);
                System.out.println("Marks        : " + marks);
                System.out.println("----------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
