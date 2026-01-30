package com.streams.serialization;

import java.io.Serializable;

//Employee class for serialization
public class Employee implements Serializable {

 private static final long serialVersionUID = 1L;

 int id;            // employee id
 String name;       // employee name
 String department; // employee department
 double salary;     // employee salary

 // Constructor
 public Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 // Display employee details
 public void display() {
     System.out.println(
             "ID: " + id +
             ", Name: " + name +
             ", Department: " + department +
             ", Salary: " + salary);
 }
}