package com.stringfileandsearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Reads and prints the file line by line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


