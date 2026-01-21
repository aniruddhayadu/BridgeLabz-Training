package com.collections.list;

import java.util.ArrayList;

public class ReverseArrayList {

	static void reverseArrayList(ArrayList<Integer> list) {

		int start = 0; 
		int end = list.size() - 1; 

		while (start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		reverseArrayList(numbers);

		System.out.println("Reversed ArrayList: " + numbers);
	}
}