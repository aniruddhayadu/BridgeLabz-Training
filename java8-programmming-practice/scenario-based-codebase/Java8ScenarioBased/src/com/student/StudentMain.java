package com.student;

import java.util.Comparator;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		Student ravi = new Student("Allu Arvind",101,"hhh",11,"male","Karnataka",52,"748737373","Electronics Engineering");
		Student sonu = new Student("sonu",102,"ggg",32,"male","patan",720,"547145154","HR");
		Student kavi = new Student("kavi",103,"fff",44,"male","delhi",229,"5555455454","IT");
		Student somya = new Student("spmya",104,"eee",22,"female","goa",280,"7473444473","IT");
		Student kali = new Student("kali",105,"ddd",14,"male","Mumbai",28,"54152852545","HR");
		Student suriya = new Student("suriya",106,"ccc",11,"male","kalipath",120,"227241541","Pharma");
		Student yuk = new Student("yuk",107,"bbb",33,"male","ramupur",40,"21145412145","HR");
		Student alice = new Student("alice",108,"aaa",77,"female","Mumbai",420,"421141","Pharma");
		
		StudentDataCenter data = new StudentDataCenter();
		data.add(suriya);
		data.add(somya);
		data.add(sonu);
		data.add(alice);
		data.add(yuk);
		data.add(kali);
		data.add(kavi);
		data.add(ravi);
		
		
		/*
		 Basic Filtering & Mapping

		1.Print all students whose rank is less than 50.
		
		2.Print all students whose age is greater than 25.
		
		3.Print the names of all students only.
		
		4.Print all students belonging to delhi.
		
		5.Print all students not from Mumbai.
		 */
		System.out.println("----------------------------Part 1---------------------------------");
		System.out.println("Basic Filtering & Mapping");
		System.out.println("-------------------------------------------------------------------");
		
		
		System.out.println("\n1.Print all students whose rank is less than 50.");
		data.studentList.stream()
						.filter(Student-> Student.getRank()<=50.0)
						.forEach(System.out::println);
		
		
		
		System.out.println("\n2.Print all students whose age is greater than 25.");
		data.studentList.stream()
						.filter(Student -> Student.getAge()>25)
						.forEach(System.out::println);
		
		
		
		System.out.println("\n3.Print the names of all students only.");
		data.studentList.stream()
						.map(Student::getName)
						.forEach(System.out::println);
		
		
		System.out.println("\n4.Print all students belonging to delhi.");
		data.studentList.stream()
						.filter(Student-> Student.getCity().equalsIgnoreCase("delhi"))
						.forEach(System.out::println);
		
		
		
		
		System.out.println("\n5.Print all students not from Mumbai.");
		data.studentList.stream()
						.filter(Student-> Student.getCity().equalsIgnoreCase("Mumbai"))
						.forEach(System.out::println);
		
		
		
		
		/*
		 Sorting & Limiting

		1.Sort students by rank (ascending).
		
		2.Sort students by age (descending).
		
		3.Print top 5 students based on rank.
		
		4.Print last 3 students based on rank.
		
		5.Print students sorted by name and then rank.

		 */
		
		System.out.println("----------------------------Part 2---------------------------------");
		System.out.println("Sorting & Limiting");
		System.out.println("-------------------------------------------------------------------");
		
		
		
		System.out.println("\n1.Sort students by rank (ascending).");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getRank))
						.forEach(System.out::println);
		
		
		
		
		
		System.out.println("\n2.Sort students by age (descending).");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getRank).reversed())
						.forEach(System.out::println);
		
		
		
		System.out.println("\n3.Print top 5 students based on rank.");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getRank).reversed())
						.limit(5)
						.forEach(System.out::println);
		
		
		System.out.println("\n4.Print last 3 students based on rank.");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getRank).reversed())
						.limit(3)
						.forEach(System.out::println);
		
		
		
		System.out.println("\n5.Print students sorted by name and then rank.");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getName))
						.forEach(System.out::println);
		
		
		
		/*
		  	Grouping & Aggregation
		  
			1.Count the number of students in each department.
			
			2.Count the number of students in each city.
			
			3.Find the average age of students in each department.
			
			4.Find the average rank of students by gender.
			
			5.Find the total number of students in the organization.
			
			6.Find the department with the highest average rank.
		 */
		
		
		System.out.println("----------------------------Part 3---------------------------------");
		System.out.println("Grouping & Aggregation");
		System.out.println("-------------------------------------------------------------------");
		
		
		
		System.out.println("\n1.Count the number of students in each department.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
				);
		
		
		
		
		System.out.println("\n2.Count the number of students in each city.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
				);
		
		
		
		
		System.out.println("\n3.Find the average age of students in each department.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getAge)))
				);
		
		
		
		
		
		System.out.println("4.Find the average rank of students by gender.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getRank)))
				);
		
		
		
		
		System.out.println("\n5.Find the total number of students in the organization.");
		System.out.println("Total Student: "+
					data.studentList.stream()
									.collect(Collectors.counting())
				);
		
		
		
		System.out.println("\n6.Find the department with the highest average rank.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getRank)))
				);
		
		/*
		 Min / Max / Ranking Problems
		
		1.Find the student with the best (lowest) rank.
		
		2.Find the student with the worst (highest) rank.
		
		3.Find the second best rank holder.
		
		4.Find the third best rank holder.
		
		5.Find the youngest student.
		
		6.Find the oldest student.
		 */
		
		System.out.println("\n----------------------------Part 4---------------------------------");
		System.out.println("Min / Max / Ranking Problems");
		System.out.println("-------------------------------------------------------------------");	
		
		
		System.out.println("\n1.Find the student with the best (lowest) rank.");
		System.out.println(
					data.studentList.stream()
									.sorted(Comparator.comparing(Student::getRank))
									.skip(0)
									.findFirst()
				);
		
		
		
		System.out.println("\n2.Find the student with the worst (highest) rank.");
		System.out.println(
					data.studentList.stream()
									.sorted(Comparator.comparing(Student::getRank).reversed())
									.skip(0)
									.findFirst()
				);
		
		
		
		System.out.println("\n3.Find the second best rank holder.");
		System.out.println(
				data.studentList.stream()
								.sorted(Comparator.comparing(Student::getRank).reversed())
								.skip(1)
								.findFirst()
			);
		
		
		
		System.out.println("\n4.Find the third best rank holder.");
		System.out.println(
				data.studentList.stream()
								.sorted(Comparator.comparing(Student::getRank).reversed())
								.skip(2)
								.findFirst()
				);
		
		
		
		System.out.println("\n5.Find the youngest student.");
		System.out.println(
				data.studentList.stream()
								.sorted(Comparator.comparing(Student::getAge))
								.skip(0)
								.findFirst()
				);
		
		
		
		System.out.println("\n6.Find the oldest student.");
		System.out.println(
				data.studentList.stream()
								.sorted(Comparator.comparing(Student::getAge).reversed())
								.skip(0)
								.findFirst()
				);
		
		
		/*
		**** FlatMap & Collections
		
		1.Print all contact numbers of all students.
		
		2.Count the total number of contact numbers.
		
		3.Find students who have more than one contact number.
		
		4.Print unique contact numbers.
		*/
		System.out.println("\n----------------------------Part 5---------------------------------");
		System.out.println("FlatMap & Collections");
		System.out.println("-------------------------------------------------------------------");	
		
		
		
		System.out.println("\n1.Print all contact numbers of all students.");
		data.studentList.stream()
						.forEach(x->System.out.println(x.getName()+" = "+x.getContacts()));
		
		
		System.out.println("\n2.Count the total number of contact numbers.");
		System.out.println(
					data.studentList.stream()
									.map(Student::getContacts)
									.distinct()
									.count()
				);
		
		
		System.out.println("\n4.Print unique contact numbers.");
		data.studentList.stream()
						.map(Student::getContacts)
						.distinct()
						.forEach(System.out::println);
		
		
		
		/*
		*** Conditional & Matching
		
		1.Check if any student belongs to Biotech Engineering.
		
		2.Check if all students are above age 20.
		
		3.Check if no student belongs to Civil Engineering.
		*/
		System.out.println("\n----------------------------Part 6---------------------------------");
		System.out.println("Conditional & Matching");
		System.out.println("-------------------------------------------------------------------");	
		
		
		System.out.println("\n1.Check if any student belongs to Biotech Engineering.");
		data.studentList.stream()
						.filter(Student-> Student.getDepartment().equalsIgnoreCase("IT"))
						.forEach(System.out::println);
		
		System.out.println("\n2.Check if all students are above age 20.");
		data.studentList.stream()
						.filter(Student-> Student.getAge()>=20)
			
						.forEach(System.out::println);
		
		System.out.println("\n3.Check if no student belongs to Civil Engineering.");
		data.studentList.stream()
						.filter(Student-> Student.getDepartment().equals("Civil Engineering"))
						.forEach(System.out::println);
		
		
		
		/*
		*** Gender-Based Analysis
		
		1.Count male and female students.
		
		2.Find the average age of male students.
		
		3.Find the average age of female students.
		
		4.Find the highest ranked male student.
		
		5.Find the highest ranked female student.
		
		*/
				
		System.out.println("\n----------------------------Part 7---------------------------------");
		System.out.println("Gender-Based Analysis");
		System.out.println("-------------------------------------------------------------------");	
		
		
		System.out.println("\n1.Count male and female students.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()))
				);
		
		
		System.out.println("\n2.Find the average age of male students.");
		System.out.println(
					data.studentList.stream()
									.filter(Student-> Student.getGender().equalsIgnoreCase("male"))
									.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)))
				);
		
		
		System.out.println("\n3.Find the average age of female students.");
		System.out.println(
				data.studentList.stream()
								.filter(Student-> Student.getGender().equalsIgnoreCase("female"))
								.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)))
			);
		
		
		System.out.println("\n4.Find the highest ranked male student.");
		System.out.println(
				data.studentList.stream()
								.filter(Student-> Student.getGender().equalsIgnoreCase("male"))
								.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getRank)))
			);
		
		
		
		System.out.println("\n5.Find the highest ranked female student.");
		System.out.println(
				data.studentList.stream()
								.filter(Student-> Student.getGender().equalsIgnoreCase("female"))
								.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getRank)))
			);
		
		/*
		*** Department-Specific Queries
		
		1.List students department-wise with names only.
		
		2.Find the youngest student in Computer Engineering.
		
		3.Find the top-ranked student in Mechanical Engineering.
		
		4.Count students in Electronics Engineering from Karnataka.
		
		*/
		
		System.out.println("\n----------------------------Part 8---------------------------------");
		System.out.println("Department-Specific Queries");
		System.out.println("-------------------------------------------------------------------");	
		
		
		System.out.println("\n1.List students department-wise with names only.");
		System.out.println(
					data.studentList.stream()
									.collect(Collectors.groupingBy(Student::getDepartment, Collectors.groupingBy(Student::getName)))
				);
		
		
		System.out.println("\n2.Find the youngest student in Computer Engineering.");
		System.out.println(
					data.studentList.stream()
									.filter(Student-> Student.getDepartment().equalsIgnoreCase("Computer Engineering"))
									.sorted(Comparator.comparing(Student::getAge))
									.skip(0)
									.findAny()
				);
		
		
		System.out.println("\n3.Find the top-ranked student in Mechanical Engineering.");
		System.out.println(
				data.studentList.stream()
								.filter(Student-> Student.getDepartment().equalsIgnoreCase("Mechanical Engineering"))
								.sorted(Comparator.comparing(Student::getAge).reversed())
								.skip(0)
								.findAny()
			);
		
		
		
		System.out.println("\n4.Count students in Electronics Engineering from Karnataka.");
		System.out.println(
				data.studentList.stream()
								.filter(Student-> Student.getDepartment().equalsIgnoreCase("Electronics Engineering"))
								.filter(Student-> Student.getCity().equalsIgnoreCase("Karnataka"))
								.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
			);
		
		/*	 
		*** Advanced Level
		
		1.Convert the student list into a Map<Id, Name>.
		
		2.Convert the student list into a Map<Department, List<Student>>.
		
		3.Find students whose name starts with ‘S’.
		
		4.Find students whose name length is greater than 5.
		
		5.Find students whose rank is even.
		
		6.Find students whose rank is odd.
		*/
			
		System.out.println("\n----------------------------Part 9---------------------------------");
		System.out.println("Advanced Level");
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("\n1.Convert the student list into a Map<Id, Name>.");
		data.studentList.stream()
						.forEach(x-> System.out.println(x.getId()+" - "+x.getName()));
		
		
		
		System.out.println("\n3.Find students whose name starts with ‘S’.");
		data.studentList.stream()
						.filter(Student-> Student.getName().startsWith("S"))
						.forEach(System.out::println);
		
		
		System.out.println("\n4.Find students whose name length is greater than 5.");
		data.studentList.stream()
						.filter(Student-> Student.getName().length()>5)
						.forEach(System.out::println);
		
		
		System.out.println("\n5.Find students whose rank is even.");
		data.studentList.stream()
						.filter(Student-> Student.getRank()%2==0)
						.forEach(System.out::println);
		
		
		System.out.println("\n6.Find students whose rank is odd.");
		data.studentList.stream()
						.filter(Student-> Student.getRank()%2!=0)
						.forEach(System.out::println);
		
		
		/*
		
		*** Bonus Challenges
		
		1.Find the top 3 youngest students.
		
		2.Find the top 3 oldest students.
		
		3.Partition students based on age > 25.
		
		4.Partition students based on rank < 100.
		
		5.Find the city having maximum students.
		
		6.Find the department having minimum students.
		
		 */
		
		System.out.println("\n----------------------------Part 9---------------------------------");
		System.out.println("Bonus Challenges");
		System.out.println("-------------------------------------------------------------------");
		
		
		System.out.println("\n1.Find the top 3 youngest students.");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getAge))
						.limit(3)
						.forEach(System.out::println);
		
		
		System.out.println("\n2.Find the top 3 oldest students.");
		data.studentList.stream()
						.sorted(Comparator.comparing(Student::getAge).reversed())
						.limit(3)
						.forEach(System.out::println);
		
		
		System.out.println("\n3.Partition students based on age > 25.");
		data.studentList.stream()
						.filter(Student-> Student.getAge()>25)
						.forEach(System.out::println);
		
		
		System.out.println("\n4.Partition students based on rank < 100.");
		data.studentList.stream()
						.filter(Student-> Student.getRank()<100)
						.forEach(System.out::println);
		
		
		System.out.println("\n5.Find the city having maximum students.");
		data.studentList.stream()
						.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));

	}
}