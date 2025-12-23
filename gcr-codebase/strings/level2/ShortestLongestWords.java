// Write a program to split the text into words and find the shortest and longest strings in a given text


import java.util.Scanner;

public class ShortestLongestWords {

    	// Method to find length of string 
    	public static int findLength(String text) {
        	int count = 0;
        	try {
            	while (true) {
                	text.charAt(count);
                	count++;
            	}
        	} catch (RuntimeException e) {}
        	return count;
    	}

    	// Method to split text into words
    	public static String[] splitByCharAt(String text) {
        	int length = findLength(text);
        	int wordCount = 1;
        	for (int i = 0; i < length; i++) {
            		if (text.charAt(i) == ' ') wordCount++;
        	}

        	String[] words = new String[wordCount];
        	int start = 0, index = 0;
        	for (int i = 0; i <= length; i++) {
            		if (i == length || text.charAt(i) == ' ') {
                		String word = "";
                		for (int j = start; j < i; j++) {
                    			word += text.charAt(j);
                		}
                	words[index++] = word;
                	start = i + 1;
            		}
        	}
        	return words;
    	}

    	// Method to create 2D array of word and length
    	public static String[][] wordsWithLength(String[] words) {
        	String[][] result = new String[words.length][2];
        	for (int i = 0; i < words.length; i++) {
            		result[i][0] = words[i];
            		result[i][1] = String.valueOf(findLength(words[i]));
        	}
        	return result;
    	}

    	// Method to find shortest and longest word lengths in 2D array
    	public static String[] findShortestLongest(String[][] wordLengths) {
        	if (wordLengths.length == 0) 
			return new String[]{"", ""};

        	String shortest = wordLengths[0][0];
        	String longest = wordLengths[0][0];
        	int minLen = Integer.parseInt(wordLengths[0][1]);
        	int maxLen = Integer.parseInt(wordLengths[0][1]);

        	for (int i = 1; i < wordLengths.length; i++) {
            		int len = Integer.parseInt(wordLengths[i][1]);
            		if (len < minLen) {
                		minLen = len;
                		shortest = wordLengths[i][0];
            		}
            		if (len > maxLen) {
                		maxLen = len;
                		longest = wordLengths[i][0];
            		}
        	}
        	return new String[]{shortest, longest};
    	}

    	public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter text:");
        	String text = sc.nextLine();

        	String[] words = splitByCharAt(text);
        	String[][] wordLengths = wordsWithLength(words);
        	String[] result = findShortestLongest(wordLengths);

        	System.out.println("Shortest word: " + result[0]);
        	System.out.println("Longest word: " + result[1]);

        	sc.close();
    	}
}