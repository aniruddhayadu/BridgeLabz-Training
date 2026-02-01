package com.csv.basics;

import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles IO exceptions

public class SearchEmployeeCSV {

	public static void main(String[] args) {

		String searchName = "princi"; // Employee name to search

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				SearchEmployeeCSV.class.getClassLoader().getResourceAsStream("data/csv/employees.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row
			boolean found = false; // Flag to check if employee is found

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split line into columns
				String[] data = line.split(",");

				String name = data[1]; // Employee Name

				// Check if employee name matches (case-insensitive)
				if (name.equalsIgnoreCase(searchName)) {

					String department = data[2]; // Employee Department
					String salary = data[3]; // Employee Salary

					// Print employee details
					System.out.println("Employee Found!");
					System.out.println("Name       : " + name);
					System.out.println("Department : " + department);
					System.out.println("Salary     : " + salary);

					found = true;
					break; // Stop searching once found
				}
			}

			// If employee not found
			if (!found) {
				System.out.println("Employee with name '" + searchName + "' not found.");
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}