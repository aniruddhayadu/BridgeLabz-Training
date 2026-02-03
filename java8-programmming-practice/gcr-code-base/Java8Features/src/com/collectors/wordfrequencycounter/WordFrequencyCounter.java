package com.collectors.wordfrequencycounter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		List<String> list = List.of(
					"Divyanshu is my friend",
					"Divyanshu is good person",
					"Divyanshu never understand me",
					"Divyanshu is always crossing limits of my patient"
				);
		
		Map<String, Integer> wordCount = list.stream()
											.flatMap(line -> Arrays.stream(line.split(" ")))
											.map(String::toLowerCase)
											.collect(
														Collectors.toMap(
																word-> word, 
																word ->1, 
																Integer::sum)
													);
		
		System.out.println(wordCount);
	}

}
