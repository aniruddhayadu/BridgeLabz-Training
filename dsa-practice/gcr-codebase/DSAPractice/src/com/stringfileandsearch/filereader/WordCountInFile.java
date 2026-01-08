package com.stringfileandsearch.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCountInFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        String targetWord = "Java";      
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                
                String[] words = line.split("\\W+"); 

                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

