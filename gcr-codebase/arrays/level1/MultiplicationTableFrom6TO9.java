import java.util.Scanner;

public class MultiplicationTableFrom6TO9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] multiplicationResult = new int[4];

        // store multiplication results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // display the result
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
