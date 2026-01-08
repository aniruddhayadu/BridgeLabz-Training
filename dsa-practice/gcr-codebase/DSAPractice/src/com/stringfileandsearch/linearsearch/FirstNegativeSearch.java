package com.stringfileandsearch.linearsearch;

public class FirstNegativeSearch {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 0, 8, -2, 7, -5}; // Example array

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number is at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }

    public static int findFirstNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i; // return index of first negative number
            }
        }
        return -1; // no negative number found
    }
}

