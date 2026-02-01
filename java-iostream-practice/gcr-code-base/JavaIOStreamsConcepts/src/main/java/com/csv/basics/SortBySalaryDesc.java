package com.csv.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class SortBySalaryDesc {

    static class Employee {
        String id;
        String name;
        String department;
        int salary;

        Employee(String id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        SortBySalaryDesc.class
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

                if (data.length < 4) {
                    continue;
                }

                String id = data[0];
                String name = data[1];
                String dept = data[2];
                int salary = Integer.parseInt(data[3]);

                employees.add(new Employee(id, name, dept, salary));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 🔽 Sort by salary descending
        employees.sort((e1, e2) -> Integer.compare(e2.salary, e1.salary));

        System.out.println("Top 5 Highest Paid Employees");
        System.out.println("--------------------------------");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(
                    "ID: " + e.id +
                    ", Name: " + e.name +
                    ", Dept: " + e.department +
                    ", Salary: " + e.salary
            );
        }
    }
}
