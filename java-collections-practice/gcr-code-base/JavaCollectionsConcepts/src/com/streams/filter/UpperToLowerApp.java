package com.streams.filter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperToLowerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputFile = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\input.txt";
		String outputFile = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\output.text";
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));
			
			String line;
			
			while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File converted from uppercase to lowercase successfully.");
		}
		catch (IOException e) {
            System.out.println("Error while processing files.");
            e.printStackTrace();

        }
		finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } 
            catch (IOException e) {
                System.out.println("Error while closing streams.");
            }
		}
	}

}
