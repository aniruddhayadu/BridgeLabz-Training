// Program to create a calculator using switch-case
import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        // Perform calculation using switch-case
        switch (op)
        {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0)
                {
                    System.out.println("Result: " + (first / second));
                }
                else
                {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
