package com.stringfileandsearch;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // return immediately if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2, 7};
        int key = 4;

        int index = linearSearch(numbers, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
