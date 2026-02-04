package com.employeeofficesystem;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Employee ramu = new Employee(101,"anni",21,"male","IT",6,80000);
		Employee sujata = new Employee(102,"princi",31,"female","IT",8,70000);
		Employee yuk = new Employee(107,"arif",22,"female","IT",2,67000);
		Employee kali = new Employee(103,"aditya",37,"male","Automation",1,1390000);
		Employee ravi = new Employee(104,"nitya",45,"male","Pharma",4,890000);
		Employee suriya = new Employee(105,"nikki",32,"male","Hardware",3,10000);
		Employee soniya = new Employee(106,"soniya",55,"female","HR",2,40000);
		
		EmployeeDataCenter data = new EmployeeDataCenter();
		data.add(ramu);
		data.add(kali);
		data.add(ravi);
		data.add(suriya);
		data.add(soniya);
		data.add(sujata);
		data.add(yuk);
		
		/*
		 	1.Use lambda to calculate employee bonus (salary > 30,000).
			
			2.Sort employees by salary using lambda.
			
			3.Use lambda to check promotion eligibility (experience > 3 years).
			
			4.Use lambda to print employee details.
			
			5.Use lambda to compare two employees’ salaries.
		 */
		
		System.out.println("1.Use lambda to calculate employee bonus (salary > 30,000).");
		data.employeeList.forEach(x-> System.out.println((x.getSalary()>30000) ? x.getName()+ " eligible for bonus " + x.getSalary()+" + "+ 2000+ " = "+ (x.getSalary()+2000): x.getName()+" Not eligible for bonus because salary below 30,000!"));
	
		
		
		System.out.println("\n2.Sort employees by salary using lambda.");
		data.employeeList.sort((a,b) -> Double.compare(b.getSalary(), a.getSalary()));
		data.employeeList.stream()
						.forEach(System.out::println);
		
		
		
		System.out.println("\n3.Use lambda to check promotion eligibility (experience > 3 years).");
		data.employeeList.forEach(x-> System.out.println((x.getExperience()>3) ? x.getName()+ " eligible for promotion because (experience > 3 years) " : x.getName()+" Not eligible for promotion because (experience > 3 years)"));
	
	
		
		
		System.out.println("\n4.Use lambda to print employee details.");
		data.employeeList
			.forEach(x-> System.out.println(x.toString()));
		
		
		
		System.out.println("\n5.Use lambda to compare two employees’ salaries.");
		
		int id1 = 101;
		int id2 = 102;
		
//		data.employeeList.stream()
//							.filter(Employee-> Employee.getId()==id1 || Employee.getId()==id2)
//							.forEach((x,y)-> System.out.println((x.getSalary()>y.getSalary()) ? "Greater" : "Less salary"));
		
		
		data.employeeList.stream()
						.filter(Employee-> (Employee.getGender().equalsIgnoreCase("male") && (Employee.getSalary()> 10000 && Employee.getSalary()<=100000)) || ((Employee.getGender().equalsIgnoreCase("female") && (Employee.getSalary()> 10000 && Employee.getSalary()<=100000))))
						.forEach(System.out::println);
	}
}

