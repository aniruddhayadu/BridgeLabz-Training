package com.runtimeanalysis;

import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 100_000, 1_000_000};
        Random rand = new Random();

        for (int size : sizes) {
            System.out.println("Dataset size: " + size);

            // Generate dataset
            int[] arrayData = new int[size];
            for (int i = 0; i < size; i++) {
                arrayData[i] = rand.nextInt(size * 10);
            }

            int target = arrayData[rand.nextInt(size)]; // Pick random target

            // Array search (Linear)
            long start = System.nanoTime();
            int index = -1;
            for (int i = 0; i < arrayData.length; i++) {
                if (arrayData[i] == target) {
                    index = i;
                    break;
                }
            }
            long arrayTime = System.nanoTime() - start;
            System.out.println("Array search: Index = " + index + ", Time = " + arrayTime / 1_000_000.0 + " ms");

            // HashSet search (O(1))
            HashSet<Integer> hashSet = new HashSet<>();
            for (int num : arrayData) hashSet.add(num);
            start = System.nanoTime();
            boolean foundHash = hashSet.contains(target);
            long hashTime = System.nanoTime() - start;
            System.out.println("HashSet search: Found = " + foundHash + ", Time = " + hashTime / 1_000_000.0 + " ms");

            // TreeSet search (O(log N))
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int num : arrayData) treeSet.add(num);
            start = System.nanoTime();
            boolean foundTree = treeSet.contains(target);
            long treeTime = System.nanoTime() - start;
            System.out.println("TreeSet search: Found = " + foundTree + ", Time = " + treeTime / 1_000_000.0 + " ms");

        }
    }
}

