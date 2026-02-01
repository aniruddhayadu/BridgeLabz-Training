package com.csv.advances;


import java.io.*;
import java.util.*;

public class MergeStudentCSV {

	
    static class Student {
        String id;
        String name;
        int age;
        int marks;
        String grade;

        Student(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();

        // reading first csv file 
        
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        MergeStudentCSV.class.getClassLoader()
                                .getResourceAsStream("data/csv/students1.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 3) continue;

                String id = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                studentMap.put(id, new Student(id, name, age));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading second file 
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        MergeStudentCSV.class.getClassLoader()
                                .getResourceAsStream("data/csv/students2.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 3) continue;

                String id = data[0];
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];

                if (studentMap.containsKey(id)) {
                    Student s = studentMap.get(id);
                    s.marks = marks;
                    s.grade = grade;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // printing merge data 
        System.out.println("ID,Name,Age,Marks,Grade");

        for (Student s : studentMap.values()) {
            System.out.println(
                    s.id + "," +
                    s.name + "," +
                    s.age + "," +
                    s.marks + "," +
                    s.grade
            );
        }
    }
}
