package com.java8_conversionlogical;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {		
		
		/*
		 *** List → Map Conversions
			
			1.Convert List of strings to Map with string as key and length as value
			
			2.Convert List of integers to Map with number and its square
			
			3.Convert List of employees to Map with id as key and name as value
			
			4.Convert List of words to Map with word and frequency
			
			5.Convert List to Map with index as key and element as value
			
			6.Convert List of objects to Map using custom key field
			
			7.Convert List to Map and handle duplicate keys
			
			8.Convert List to Map keeping only first duplicate
			
			9.Convert List to Map keeping only last duplicate
			
			10.Convert List into Map grouped by string length
		 */
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("List → Map Conversions");
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.println("\n1.Convert List of strings to Map with string as key and length as value");
		List<String> stringList = Arrays.asList(
				"Hello",
				"Hii",
				"How",
				"Hello",
				"This",
				"Hii"
			);
	
		Map<String,Integer> mapData = stringList.stream().collect(Collectors.toMap(s-> s, s-> s.length(), (oldVal,newVal)-> oldVal));
		for(var c : mapData.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n2.Convert List of integers to Map with number and its square");
		List<Integer> integerList = Arrays.asList(
					10,
					4,
					2,
					2,
					54,
					23
				);
		
		Map<Integer,Integer> integerMap = integerList.stream().collect(Collectors.toMap(s-> s, s-> s*s, (oldVal,newVal)-> oldVal));
		for(var c : integerMap.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n3.Convert List of employees to Map with id as key and name as value");
		
		Employee ramu = new Employee(101,"ramu",21,"male","IT",2015,80000);
		Employee sujata = new Employee(102,"sujta",31,"female","IT",2022,70000);
		Employee yuk = new Employee(107,"yuk",22,"female","IT",2016,670000);
		Employee kali = new Employee(103,"kali",37,"male","Automation",2014,1390000);
		Employee ravi = new Employee(104,"ravi",45,"male","Pharma",2011,890000);
		Employee suriya = new Employee(105,"suriya",32,"male","Hardware",2000,10000);
		Employee soniya = new Employee(106,"soniya",55,"female","HR",2026,40000);
		
		EmployeeDataCenter data = new EmployeeDataCenter();
		data.add(ramu);
		data.add(kali);
		data.add(ravi);
		data.add(suriya);
		data.add(soniya);
		data.add(sujata);
		data.add(yuk);
		
		Map<Integer,String> employeeMap = data.employeeList.stream()
															.collect(Collectors.toMap(s-> s.getId(), s-> s.getName()));
		for(var c : employeeMap.entrySet()) {
			System.out.println(c.getKey()+ " - "+c.getValue());
		}
		
		
		
		System.out.println("\n4.Convert List of words to Map with word and frequency");
		List<String> wordList = Arrays.asList(
				"Hello",
				"Hii",
				"How",
				"Hello",
				"This",
				"Hii"
			);
		
		Map<String,Integer> wordMap = wordList.stream()
												.collect(Collectors.toMap(
														s-> s,
														s->1,
														Integer::sum)
													);
		for(var c : wordMap.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n5.Convert List to Map with index as key and element as value");
		Map<Integer,String> maping = IntStream.range(0, wordList.size())
												.boxed()
												.collect(Collectors.toMap(i-> i, i-> wordList.get(i)));
		
		for(var c : maping.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		
		System.out.println("\n6.Convert List of objects to Map using custom key field");
		Map<Integer,Employee> mapEmp = data.employeeList.stream()
															.collect(Collectors.toMap(u-> u.getId(), u-> u));
		mapEmp.forEach((key,val) -> 
					System.out.println(key + " -  "+ val)
				);
		
		
		
		System.out.println("\n7.Convert List to Map and handle duplicate keys");
		for(var c : integerMap.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n8.Convert List to Map keeping only first duplicate");
		Map<String,Integer> mapingData = stringList.stream().collect(Collectors.toMap(s-> s, s-> s.length(), (oldVal,newVal)-> oldVal));
		for(var c : mapingData.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n9.Convert List to Map keeping only last duplicate");
		Map<String,Integer> mapedData = stringList.stream().collect(Collectors.toMap(s-> s, s-> s.length(), (oldVal,newVal)-> newVal));
		for(var c : mapedData.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		System.out.println("\n10.Convert List into Map grouped by string length");
		Map<Integer,List<String>> stringLengthMap = stringList.stream().collect(Collectors.groupingBy(String::length));
		stringLengthMap.forEach((key,val) ->  
					System.out.println(key + " - " + val)
				);
		
		
	}
}
