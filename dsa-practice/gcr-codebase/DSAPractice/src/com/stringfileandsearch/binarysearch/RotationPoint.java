package com.stringfileandsearch.binarysearch;

public class RotationPoint {
    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12}; 

        int rotationIndex = findRotationPoint(rotatedArray);

        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + rotatedArray[rotationIndex]);
    }

    public static int findRotationPoint(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] > array[right]) {
                left = mid + 1;
            } 
	    else {
                right = mid; 
            }
        }

        return left;
    }
}