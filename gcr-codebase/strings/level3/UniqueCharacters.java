//Find unique characters in a string using the charAt() method and display the result


import java.util.Scanner;

public class UniqueCharacters {

    	// method to find length of string without using length()
    	public static int findLength(String text) {
        	int count = 0;
        	try {
            		while (true) {
                	text.charAt(count);
                	count++;
            	}
        	} catch (Exception e) {}

        	return count;
    	}

    	// method to find unique characters
    	public static char[] findUniqueCharacters(String text) {

        	int len = findLength(text);
        	char[] temp = new char[len];
        	int index = 0;

        	for (int i = 0; i < len; i++) {
            		char ch = text.charAt(i);
            		boolean isUnique = true;

            		for (int j = 0; j < i; j++) {
                		if (ch == text.charAt(j)) {
                    			isUnique = false;
                    			break;
                		}
            		}

            		if (isUnique) {
                		temp[index] = ch;
                		index++;
            		}
        	}

        	// Create new array of exact size
        	char[] result = new char[index];
        	for (int i = 0; i < index; i++) {
            		result[i] = temp[i];
        	}

        	return result;
    	}

    	public static void main(String[] args) {

		// scanner object
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String text = sc.nextLine();

        	char[] uniqueChars = findUniqueCharacters(text);

        	System.out.println("Unique characters are:");
        	for (int i = 0; i < uniqueChars.length; i++) {
            		System.out.print(uniqueChars[i] + " ");
        	}

        	sc.close();
    	}
}
