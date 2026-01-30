package com.streams.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFile = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\source.txt";
		String destinationFile = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\destination.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);
			
			int data;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("Successfully Copied file");
		}
		catch(IOException e) {
			System.out.println("Source file does not exist or an error occurred.");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			}
			catch (IOException e) {
				System.out.println("Error while closing file streams.");
			}
		}
		
	}

}
