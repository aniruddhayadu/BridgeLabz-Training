package com.stringfileandsearch.stringbuffer;

public class StringBufferConcatenate {
    public static void main(String[] args) {
        // Example array of strings
        String[] words = {"Java", "is", "awesome"};

        // create StringBuffer
        StringBuffer sb = new StringBuffer();

        // append each string in the array
        for (String word : words) {
            sb.append(word);
        }

        // convert to String
        String result = sb.toString();

        System.out.println("Concatenated string: " + result);
    }
}

