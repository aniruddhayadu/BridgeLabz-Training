// Java program to convert centimeters  into feet and inches
import java.util.Scanner;
public class CentimetersInInchesAndFeets {
    public static void main(String[] args) {
        // creating an variable for height
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height");
        height = input.nextFloat();
        // creating an variable and calculating height in inches
        float heightInInches = height / (float) 2.54;
        // creating an variable and calculating height in feets
        float heightInFeets = height * (float) 0.032;

        // displaying the result
        System.out.println("Your Height in cm is  " + height + " while in feet is " + heightInFeets + " and inches is " + heightInInches);

    }
}