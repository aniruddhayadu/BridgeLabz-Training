import java.util.Scanner;

public class RemoveCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = sc.nextLine();

		System.out.print("Enter character to remove: ");
		char ch = sc.next().charAt(0);

		String result = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ch) {
				result += text.charAt(i);
			}
		}

		System.out.println("Modified String: " + result);
		sc.close();
	}
}
