package com.sortingalgorithms;

public class BubbleSortStudentMarks {

    // Function to sort marks using Bubble Sort
    public static void bubbleSort(int[] marks) {

        int n = marks.length;
        boolean swapped;

        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {
                    // Swap if elements are in wrong order
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] marks = {65, 90, 78, 85, 60, 72};

        System.out.println("Before Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        bubbleSort(marks);

        System.out.println("\nAfter Sorting (Ascending Order):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
