package com.sortingalgorithms;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void printArray(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] examScores = {78, 92, 85, 69, 88, 74};

        System.out.println("Exam scores before sorting:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("Exam scores after sorting:");
        printArray(examScores);
    }
}