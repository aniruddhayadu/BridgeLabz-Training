import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Make a copy of number for processing
        int temp = number;



        // find digits and store in array
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }


        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }


        // Frequency array
        int[] freq = new int[10];
 
        // calculate frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }



        // display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
