package com.feedbackguru;

import java.io.*;
import java.util.*;

// Reads all .txt feedback files from a directory
public class FeedbackReader {

	// Reads feedback lines from given folder
	public static List<String> readFeedbackFiles(String folderPath) {

		List<String> feedbackLines = new ArrayList<>(); // Stores feedback text

		try {
			File folder = new File(folderPath); // Folder reference
			File[] files = folder.listFiles(); // Lists all files

			// Loops through each file
			for (File file : files) {

				// Checks only .txt files
				if (file.getName().endsWith(".txt")) {

					BufferedReader br = new BufferedReader(new FileReader(file)); // Reader

					String line;

					// Reads file line by line
					while ((line = br.readLine()) != null) {
						feedbackLines.add(line); // Stores feedback line
					}

					br.close(); // Closes reader
				}
			}
		} catch (Exception e) {
			System.out.println("Error reading files: " + e.getMessage()); // Handles IO error
		}

		return feedbackLines; // Returns all feedback lines
	}
}