package com.sortingalgorithms;

public class HeapSortSalaryDemands {

    // Method to perform Heap Sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        //  Extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }


    public static void heapify(int[] salaries, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            heapify(salaries, heapSize, largest);
        }
    }

    public static void printArray(int[] salaries) {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] salaryDemands = {45000, 60000, 52000, 75000, 48000, 68000};

        System.out.println("Salary demands before sorting:");
        printArray(salaryDemands);

        heapSort(salaryDemands);

        System.out.println("Salary demands after sorting:");
        printArray(salaryDemands);
    }
}
