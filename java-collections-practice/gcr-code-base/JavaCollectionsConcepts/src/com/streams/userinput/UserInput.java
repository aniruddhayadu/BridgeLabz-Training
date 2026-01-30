package com.streams.userinput;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = null;
		
		try {
			System.out.println("Enter your name: ");
			String name = br.readLine();
			
			System.out.println("Enter your age: ");
			String age = br.readLine();
			
			System.out.println("Enter your favorite programming language: ");
			String lang = br.readLine();
			writer = new FileWriter("C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\userData.txt");

			writer.write("Name: " + name + "\n");
			writer.write("Age: " + age + "\n");
			writer.write("Favorite Language: " + lang + "\n");
			
			System.out.println("User input data saved successfully...... ");
		}
		catch(IOException e) {
			System.out.println("An error occured while writing or reading file..");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(writer != null) {
					writer.close();
				}
			}
			catch(IOException e) {
				System.out.println("An error occured while closing file..");
				System.out.println(e.getMessage());
			}
		}
	}

}
