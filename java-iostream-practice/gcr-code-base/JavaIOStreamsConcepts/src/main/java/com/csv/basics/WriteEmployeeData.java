package com.csv.basics;

import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 

public class WriteEmployeeData {

	public static void main(String[] args) {


		String directoryPath = "output";
		String filePath = directoryPath + "/employees.csv";


		File directory = new File(directoryPath);
		if (!directory.exists()) {
			directory.mkdir();
		}


		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {


			writer.write("ID,Name,Department,Salary");
			writer.newLine();


			writer.write("101,Aniruddha,Technical,90000");
			writer.newLine();

			writer.write("102,Aditya,HR,92000");
			writer.newLine();

			writer.write("103,Prici,Marketing,99000");
			writer.newLine();

			writer.write("104,Arif,Finance,82000");
			writer.newLine();

			writer.write("105,Nikki,Sales,98000");
			writer.newLine();

			// Confirmation message
			System.out.println("Employee CSV file created successfully!");

		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
