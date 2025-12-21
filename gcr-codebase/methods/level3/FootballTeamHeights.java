//Create a program to find the shortest, tallest, and mean height of players present in a football team.

import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate sum of all heights
    public static int sum(int[] heights) {
        int total = 0;
        for (int h : heights) {
            total += h;
        }
        return total;
    }

    // Method to calculate mean height
    public static double mean(int[] heights) {
        int total = sum(heights);
        return (double) total / heights.length;
    }

    // Method to find shortest height
    public static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11]; 

        Random rand = new Random();

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 + 0-100 = 150-250
        }

        // Display all player heights
        System.out.println("Player heights (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i]);
        }

        // Calculate and display results
        System.out.println("\nShortest height: " + shortest(heights) + " cm");
        System.out.println("Tallest height: " + tallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean(heights));
    }
}
