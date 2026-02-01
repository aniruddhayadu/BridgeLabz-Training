package com.csv.advances;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVToStudentObjects {

    // INNER CLASS (perfect for this use-case)
    static class Student {
        String id;
        String name;
        int age;
        int marks;

        Student(String id, String name, int age, int marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        ConvertCSVToStudentObjects.class
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
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all Student objects
        System.out.println("Student Objects");
        System.out.println("-------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

