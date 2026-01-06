package com.sortingalgorithms;

public class CountingSortStudentAges {

    // Method to perform Counting Sort
    public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        // create count array
        int[] count = new int[range];

        // Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // build the output array
        int[] output = new int[ages.length];

        // Place elements in correct positions (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Copy sorted values back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    // Method to print the array
    public static void printArray(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 13, 12, 16, 11};

        System.out.println("Student ages before sorting:");
        printArray(studentAges);

        countingSort(studentAges);

        System.out.println("Student ages after sorting:");
        printArray(studentAges);
    }
}