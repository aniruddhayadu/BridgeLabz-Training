import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        // Input
        for (int index = 0; index < 3; index++) {
            age[index] = input.nextInt();
            height[index] = input.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        // Find youngest and tallest
        for (int index = 1; index < 3; index++) {
            if (age[index] < age[youngest]) {
                youngest = index;
            }
            if (height[index] > height[tallest]) {
                tallest = index;
            }
        }

        // Output
        System.out.println("Youngest friend index: " + youngest);
        System.out.println("Tallest friend index: " + tallest);
    }
}
