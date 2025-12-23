import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		String toggled = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isUpperCase(ch)) {
				toggled += Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				toggled += Character.toUpperCase(ch);
			} else {
				toggled += ch;
			}
		}

		System.out.println("Toggled case string: " + toggled);
		sc.close();
	}
}
