package com.stringfileandsearch.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(array);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + array[peakIndex]);
    }

    public static int findPeak(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean isLeftSmaller = (mid == 0) || (array[mid] > array[mid - 1]);
            boolean isRightSmaller = (mid == array.length - 1) || (array[mid] > array[mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return mid;
            } else if (!isLeftSmaller) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }

        return -1;
    }
}
