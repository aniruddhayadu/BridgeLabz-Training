package com.stringfileandsearch.linearsearch;

public class SearchSentence {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is fun",
            "I love programming",
            "Linear search is simple",
            "Data Structures are important"
        };

        String targetWord = "Linear";

        String result = findSentenceWithWord(sentences, targetWord);

        System.out.println(result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // return the first sentence containing the word
            }
        }
        return "Not Found"; // if no sentence contains the word
    }
}
