package com.stringfileandsearch.inputstreamreader;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "userInput.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(filePath, true);

            System.out.println("Enter text (type 'exit' to finish):");

            String userInput;
            while (true) {
                userInput = reader.readLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                fileWriter.write(userInput + System.lineSeparator());
            }

            fileWriter.close();
            reader.close();
            inputStreamReader.close();

            System.out.println("All input has been saved to " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

