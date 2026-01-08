package com.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: stop if already sorted
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] sizes = {1000, 10000, 100000}; // 1 million may be too heavy for Bubble Sort

        for (int size : sizes) {
            int[] originalData = new int[size];
            for (int i = 0; i < size; i++) {
                originalData[i] = rand.nextInt(size * 10);
            }

            System.out.println("Dataset size: " + size);

            // Bubble Sort
            if (size <= 10000) { // Avoid huge Bubble Sort
                int[] data = Arrays.copyOf(originalData, size);
                long start = System.nanoTime();
                bubbleSort(data);
                long time = System.nanoTime() - start;
                System.out.println("Bubble Sort: " + time / 1_000_000.0 + " ms");
            } else {
                System.out.println("Bubble Sort: Unfeasible");
            }

            // Merge Sort
            int[] dataMerge = Arrays.copyOf(originalData, size);
            long start = System.nanoTime();
            mergeSort(dataMerge, 0, size - 1);
            long time = System.nanoTime() - start;
            System.out.println("Merge Sort: " + time / 1_000_000.0 + " ms");

            // Quick Sort
            int[] dataQuick = Arrays.copyOf(originalData, size);
            start = System.nanoTime();
            quickSort(dataQuick, 0, size - 1);
            time = System.nanoTime() - start;
            System.out.println("Quick Sort: " + time / 1_000_000.0 + " ms");

            System.out.println("----------------------------------------");
        }
    }
}

