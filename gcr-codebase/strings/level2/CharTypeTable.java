//Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter


import java.util.Scanner;

public class CharTypeTable {

    	// Method to check character type
    	public static String checkCharType(char ch) {
        	if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + 32);  
		}
	        if (ch >= 'a' && ch <= 'z') {
            		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				 return "Vowel";
			}
            		else {
	 			return "Consonant";
			}
		}
        	return "Not a Letter";
    	}

    	// Method to create 2D array of char and its type
    	public static String[][] charTypes(String text) {
        	int len = text.length();
        	String[][] result = new String[len][2];
        	for (int i = 0; i < len; i++) {
            		result[i][0] = String.valueOf(text.charAt(i));
            		result[i][1] = checkCharType(text.charAt(i));
        	}
        	return result;
    	}

    	// Display 2D array in tabular format
    	public static void displayTable(String[][] arr) {
        	System.out.println("Character\tType");
        	for (int i = 0; i < arr.length; i++) {
            		System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        	}
    	}

    	public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter text:");
        	String text = sc.nextLine();

        	String[][] result = charTypes(text);
        	displayTable(result);

        	sc.close();
    	       }
}
