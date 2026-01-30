package com.streams.largefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogReader {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\largefile.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
                
            }

        } 
        catch (IOException e) {
            System.out.println("Error while reading the large file.");
            e.printStackTrace();

        } 
        finally {

            try {
                if (reader != null)
                    reader.close();
            } 
            catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}