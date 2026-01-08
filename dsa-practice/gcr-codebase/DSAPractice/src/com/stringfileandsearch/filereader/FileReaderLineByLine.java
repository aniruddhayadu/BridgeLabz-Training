package com.stringfileandsearch.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderLineByLine {
    public static void main(String[] args) {
    	
        String filePath = "example.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
