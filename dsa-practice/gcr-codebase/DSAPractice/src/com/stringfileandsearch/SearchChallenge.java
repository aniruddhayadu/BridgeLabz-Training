package com.stringfileandsearch;

import java.util.Arrays;

public class SearchChallenge {
    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1, 7, 5};
        int target = 4;

        // Linear Search: Find first missing positive integer
        int missing = firstMissingPositive(numbers);
        System.out.println("First missing positive integer: " + missing);

        // Binary Search: Find index of target
        Arrays.sort(numbers); // Binary search requires sorted array
        int index = binarySearch(numbers, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    // Linear Search approach
    public static int firstMissingPositive(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            while (array[i] > 0 && array[i] <= n && array[i] != array[array[i] - 1]) {
                int correctPos = array[i] - 1;
                int temp = array[i];
                array[i] = array[correctPos];
                array[correctPos] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Binary Search approach
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }
}
