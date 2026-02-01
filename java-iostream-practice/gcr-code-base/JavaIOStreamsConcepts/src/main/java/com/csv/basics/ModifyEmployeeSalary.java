package com.csv.basics;

import java.io.BufferedReader; // For reading CSV file
import java.io.BufferedWriter; // For writing CSV file
import java.io.InputStreamReader; // Converts byte stream to char stream
import java.io.FileWriter; // Writes characters to file
import java.io.File; // Represents file path
import java.io.IOException; // Handles IO exceptions

public class ModifyEmployeeSalary {

	public static void main(String[] args) {

		String outputDir = "output"; // Output folder
		String outputFile = outputDir + "/updated_employees.csv";

		// Create output directory if not exists
		File dir = new File(outputDir);
		if (!dir.exists()) {
			dir.mkdir();
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				ModifyEmployeeSalary.class.getClassLoader().getResourceAsStream("data/csv/employees.csv")));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			boolean isHeader = true; // Flag to handle header row

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Write header row directly
				if (isHeader) {
					bw.write(line);
					bw.newLine();
					isHeader = false;
					continue;
				}

				// Split CSV row into columns
				String[] data = line.split(",");

				String department = data[2]; // Department column
				double salary = Double.parseDouble(data[3]); // Salary column

				// Increase salary by 10% if department is IT
				if (department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}

				// Write updated row to new CSV file
				bw.write(data[0] + "," + data[1] + "," + department + "," + (int) salary);
				bw.newLine();
			}

			// Confirmation message
			System.out.println("CSV file updated successfully!");

		} catch (IOException e) {
			// Handle file read/write exceptions
			e.printStackTrace();
		}
	}
}