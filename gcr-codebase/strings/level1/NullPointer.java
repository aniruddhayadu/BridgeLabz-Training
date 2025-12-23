// Write a program to demonstrate NullPointerException
public class NullPointer {

	// Method to generate NullPointerException
	public static void generateException() {

		String text = null;   

		System.out.println(text.length());
	}

	// Method to handle NullPointerException
	public static void handleException() {

		String text = null;   
		try {
			// calling String method
			System.out.println(text.length());
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException caught successfully");
		}
	}

	public static void main(String args[]) {
		
		System.out.println("generating exception");

		try {
			generateException();
		}
		catch (NullPointerException e) {
			System.out.println("Exception occurred");
		}
			
		System.out.println("Exception Handling");

		handleException();
	}
}