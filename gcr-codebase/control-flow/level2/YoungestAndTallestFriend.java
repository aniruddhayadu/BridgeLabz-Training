import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
		//scanner object
        	Scanner sc = new Scanner(System.in);

        	// Age input
       		System.out.print("Enter Amar age: ");
        	int amarAge = sc.nextInt();

        	System.out.print("Enter Akbar age: ");
        	int akbarAge = sc.nextInt();

        	System.out.print("Enter Anthony age: ");
        	int anthonyAge = sc.nextInt();

        	// Height input
        	System.out.print("Enter Amar height: ");
        	int amarHeight = sc.nextInt();

        	System.out.print("Enter Akbar height: ");
        	int akbarHeight = sc.nextInt();

        	System.out.print("Enter Anthony height: ");
        	int anthonyHeight = sc.nextInt();

        	// Find youngest
        	if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            		System.out.println("Youngest friend is Amar");
        	} 
		else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            		System.out.println("Youngest friend is Akbar");
        		} else {
            		System.out.println("Youngest friend is Anthony");
        		}

        	// Find tallest
        	if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            		System.out.println("Tallest friend is Amar");
        		}
		else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            		System.out.println("Tallest friend is Akbar");
        		} 
		    else {
           	System.out.println("Tallest friend is Anthony");
        	}

        	sc.close();
    	}
}
