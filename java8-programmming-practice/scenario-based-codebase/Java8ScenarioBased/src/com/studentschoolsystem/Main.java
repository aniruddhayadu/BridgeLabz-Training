package com.studentschoolsystem;

public class Main {

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
		  	1.Use a lambda expression to print a welcome message for a student.
			
			2.Use lambda to check if a student is pass or fail based on marks.
			
			3.Sort students by name using lambda.
			
			4.Sort students by rank using lambda.
			
			5.Use lambda to display students whose age is above 18.
		 */
		
		
		System.out.println("\n1.Use a lambda expression to print a welcome message for a student.");
		data.studentList.stream()
						.forEach(x-> System.out.println("Welcome - "+x.getName()));
		
		
		System.out.println("\n2.Use lambda to check if a student is pass or fail based on marks.");
		data.studentList.stream()
						.forEach(x-> System.out.println((x.getRank()>500) ? x.getName() + " Passed" : x.getName()+" Fail"));
		
		
		System.out.println("\n3.Sort students by name using lambda.");
		data.studentList.sort((a,b) -> a.getName().compareTo(b.getName()));
		data.studentList.stream()
						.forEach(System.out::println);
		
		System.out.println("\n4.Sort students by rank using lambda.");
		data.studentList.sort((a,b) -> Double.compare(a.getRank(), b.getRank()));
		data.studentList.stream()
						.forEach(System.out::println);
		
		
		System.out.println("\n5.Use lambda to display students whose age is above 18.");
		data.studentList.forEach(x-> System.out.println((x.getAge()>18) ? x.toString() : x.getName()+" Below 18"));
		
	}
}
