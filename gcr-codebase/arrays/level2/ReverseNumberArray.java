import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number :");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Print reversed number
        System.out.println("The reverse number is :");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
