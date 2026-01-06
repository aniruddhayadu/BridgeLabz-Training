package com.sortingalgorithms;

public class InsertionSortEmployeeID {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        // Start from the second element (first element is already considered sorted)
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];   // Element to be inserted
            int j = i - 1;

            // Move elements of the sorted part that are greater than key
            // one position ahead to make space for key
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert the key at the correct position
            employeeIds[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] employeeIds) {
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108};

        System.out.println("Employee IDs before sorting:");
        printArray(employeeIds);

        insertionSort(employeeIds);

        System.out.println("Employee IDs after sorting:");
        printArray(employeeIds);
    }
}

