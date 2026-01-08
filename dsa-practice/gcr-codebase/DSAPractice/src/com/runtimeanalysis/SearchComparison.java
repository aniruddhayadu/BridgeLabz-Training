package com.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Not found
    }

    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // Example dataset sizes
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            // Generate random dataset
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(size * 10);
            }

            int target = data[rand.nextInt(size)]; // Random target from dataset

            // Linear search timing
            long startTime = System.nanoTime();
            int linearIndex = linearSearch(data, target);
            long linearTime = System.nanoTime() - startTime;

            // Sort data for binary search
            Arrays.sort(data);

            // Binary search timing
            startTime = System.nanoTime();
            int binaryIndex = binarySearch(data, target);
            long binaryTime = System.nanoTime() - startTime;

            System.out.println("Dataset size: " + size);
            System.out.println("Linear Search: Index = " + linearIndex + ", Time = " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search: Index = " + binaryIndex + ", Time = " + binaryTime / 1_000_000.0 + " ms");
            
        }
    }
}
