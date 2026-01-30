package com.streams.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Program to serialize and deserialize employee objects
public class EmployeeApp {

    private static final String FILE_PATH = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\employees.dat";
    
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Creating employee objects
        employees.add(new Employee(101, "Aniruddha", "IT", 50000));
        employees.add(new Employee(102, "Nikki", "HR", 45000));
        employees.add(new Employee(103, "Tripti", "Finance", 60000));

        // Serialize employee list
        serializeEmployees(employees);

        // Deserialize and display employee list
        deserializeEmployees();
    }

    // Serialize list of employees
    private static void serializeEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
    }

    // Deserialize list of employees
    @SuppressWarnings("unchecked")
    private static void deserializeEmployees() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_PATH))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Details:");
            for (Employee emp : employees) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}