package com.collections.list;

import java.util.*;

public class FrequencyCounter {
	static Map<String, Integer> countFrequency(List<String> list) {

		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String item : list) {
			if (frequencyMap.containsKey(item)) {
				frequencyMap.put(item, frequencyMap.get(item) + 1);
			}
			else {
				frequencyMap.put(item, 1);
			}
		}
		return frequencyMap;
	}

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

		Map<String, Integer> result = countFrequency(fruits);
		System.out.println("Frequency of elements: " + result);
	}
}
