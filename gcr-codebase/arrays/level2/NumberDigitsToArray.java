import java.util.Scanner;

public class NumberDigitsToArray {
    public static void main(String[] args) {

	//scanner object
        Scanner input = new Scanner(System.in);
	//taking user input
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

	// storing the digits of number in array
        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
	

	// finding largest and second largest 
        
	int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
