package com.streams.wordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class WordCountApp {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Acer\\Desktop\\JavaProgrammingWorkspace\\java-collections-practice\\gcr-code-base\\JavaCollectionsConcepts\\files\\input.txt";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word,
                                wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(wordCountMap.entrySet());

            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            System.out.println("Top 5 most frequent words:");
            int count = 0;

            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                count++;
                if (count == 5)
                    break;
            }

        } 
        catch (IOException e) {
            System.out.println("Error while reading file.");
            e.printStackTrace();

        } 
        finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error while closing reader.");
            }
        }
    }
}