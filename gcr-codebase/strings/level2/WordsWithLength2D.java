//Write a program to split the text into words and return the words along with their lengths in a 2D array


import java.util.Scanner;

public class WordsWithLength2D {

    	// Method to find length of string
    		public static int findLength(String text) {
        	int count = 0;
        	try {
            	while (true) {
                	text.charAt(count);
                	count++;
            	}
        	} catch (RuntimeException e) {
           
        	}
        	return count;
    	}

    	// Method to split text into words
    	public static String[] splitByCharAt(String text) {
        	int length = findLength(text);

        	// Count words
        	int wordCount = 1;
        	for (int i = 0; i < length; i++) {
            		if (text.charAt(i) == ' ') {
                		wordCount++;
            		}
        	}

        	String[] words = new String[wordCount];
        	int start = 0;
        	int index = 0;

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

    	// Method to create 2D array of word and its length
    	public static String[][] wordsWithLength(String[] words) {
        	String[][] result = new String[words.length][2];
        	for (int i = 0; i < words.length; i++) {
            		result[i][0] = words[i];                        
            		result[i][1] = String.valueOf(findLength(words[i]));
        	}
        	return result;
    	}

    	public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);

        	// taking input
        	System.out.println("Enter text :");
        	String text = sc.nextLine();

        	// Split words
        	String[] words = splitByCharAt(text);

        	// Create 2D array of word and length
        	String[][] wordLengths = wordsWithLength(words);

        	// Display
        	System.out.println("Word\tLength");
        	for (int i = 0; i < wordLengths.length; i++) {
            		String word = wordLengths[i][0];
            		int length = Integer.parseInt(wordLengths[i][1]);
            		System.out.println(word + "\t" + length);
        	}

        	sc.close();
    	}
}