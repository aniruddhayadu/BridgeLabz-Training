package com.collections.list;

import java.util.LinkedList;

public class NthFromEnd {

	static String findNthFromEnd(LinkedList<String> list, int n) {
		if (n <= 0 || n > list.size()) {
			return "Invalid N value";
		}

		int fast = 0; 
		int slow = 0; 
		for (int i = 0; i < n; i++) {
			fast++;
		}

		// Move both pointers until fast reaches end
		while (fast < list.size()) {
			fast++;
			slow++;
		}

		// Slow pointer is now at Nth element from end
		return list.get(slow);
	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		int n = 2;

		System.out.println("Nth element from end: " + findNthFromEnd(list, n));
	}
}
