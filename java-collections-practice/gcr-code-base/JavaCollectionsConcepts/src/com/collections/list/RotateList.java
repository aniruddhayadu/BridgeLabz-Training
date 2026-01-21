package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {
	static void rotateLeft(List<Integer> list, int k) {

		int n = list.size();
		k = k % n;
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			temp.add(list.get(i));
		}
		for (int i = k; i < n; i++) {
			list.set(i - k, list.get(i));
		}
		for (int i = 0; i < temp.size(); i++) {
			list.set(n - k + i, temp.get(i));
		}
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

		rotateLeft(numbers, 2);

		System.out.println("Rotated List: " + numbers);
	}
}
