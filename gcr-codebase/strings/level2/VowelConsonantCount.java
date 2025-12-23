//Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string

import java.util.Scanner;

public class VowelConsonantCount {

    	// Check if character is vowel, consonant or not a letter
    	public static String checkCharType(char ch) {
        	if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32); // convert uppercase to lowercase

        	if (ch >= 'a' && ch <= 'z') {
            		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                		return "Vowel";
            	else
                	return "Consonant";
        	}
        	return "Invalid char";
    	}

    	// Count vowels and consonants using charAt()
    	public static int[] countVowelsConsonants(String text) {
        	int vowels = 0, consonants = 0;
        	for (int i = 0; i < text.length(); i++) {
            		String type = checkCharType(text.charAt(i));
            		if (type.equals("Vowel")) {
				 vowels++;
			}
            		else if (type.equals("Consonant")) {
				consonants++;
			}
        	}
        	return new int[]{vowels, consonants};
    	}

    	public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter text:");
        	String text = sc.nextLine();

        	int[] result = countVowelsConsonants(text);

        	System.out.println("Vowels count: " + result[0]);
        	System.out.println("Consonants count: " + result[1]);
	
        	sc.close();
    	}
}

