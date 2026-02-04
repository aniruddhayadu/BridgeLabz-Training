package com.employee;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee ramu = new Employee(101,"princi",21,"male","IT",2015,80000);
		Employee sujata = new Employee(102,"anni",31,"female","IT",2022,70000);
		Employee yuk = new Employee(107,"hanumaan",22,"female","IT",2016,670000);
		Employee kali = new Employee(103,"aditya",37,"male","Automation",2014,1390000);
		Employee ravi = new Employee(104,"ravindra",45,"male","Pharma",2011,890000);
		Employee suriya = new Employee(105,"pinku",32,"male","Hardware",2000,10000);
		Employee soniya = new Employee(106,"soniya",55,"female","HR",2026,40000);
		
		EmployeeDataCenter data = new EmployeeDataCenter();
		data.add(ramu);
		data.add(kali);
		data.add(ravi);
		data.add(suriya);
		data.add(soniya);
		data.add(sujata);
		data.add(yuk);
		
		//1. How many male and female employees are there in the organization ?
		System.out.println("1. How many male and female employees are there in the organization ?");
		System.out.println(data.employeeList.stream()
											.collect(
													Collectors.groupingBy(
															Employee::getGender,Collectors.counting()
															)
													)
											);
		
		//2. Print the name of all departments in the organization ?
		System.out.println("\n2. Print the name of all departments in the organization ?");
		data.employeeList.stream()
						.map(Employee::getDepartment)
						.distinct()
						.collect(Collectors.toList())
						.forEach(System.out::println);
		
		
		//3. What is the average age of male and female employees ?
		System.out.println("\n3. What is the average age of male and female employees ?");
		System.out.println(data.employeeList.stream()
											.collect(Collectors.groupingBy(Employee::getGender,Collectors
											.averagingInt(Employee::getAge)
														)
													)
												);
		
		//4. Get the details of highest paid employee in the organization ?
		System.out.println("\n4. Get the details of highest paid employee in the organization ?");
		System.out.println(
					data.employeeList.stream()
									.collect(Collectors
											.maxBy(Comparator
													.comparing(Employee::getSalary)))
				);
		
		
		//5. Get the names of all employees who have joined after 2015 ?
		System.out.println("\n 5. Get the names of all employees who have joined after 2015 ?");
		data.employeeList.stream()
							.filter(Employee-> Employee.getYearOfJoining()>=2015)
							.forEach(System.out::println);
		
		
		//6. Count the number of employees in each department ?
		System.out.println("\n6. Count the number of employees in each department ?");
		System.out.println(data.employeeList.stream()
											.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
		
		
		
		//7. What is the average salary of each department ?
		System.out.println("\n7. What is the average salary of each department ?");
		System.out.println(
					data.employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment,Collectors
							.averagingDouble(Employee::getSalary)))
				);
		
		
		//8. Get the details of youngest male employee in the IT department ?
		System.out.println("\n8. Get the details of youngest male employee in the IT department ?");
		Optional<Employee> youngest = data.employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		
		System.out.println(
					youngest.get()
				);
		
		
		//9. Who has the most working experience in the organization?
		System.out.println("\n9. Who has the most working experience in the organization?");
		Optional<Employee> maxExperience = data.employeeList.stream()
															.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(maxExperience.get());
		
		
		//10. How many male and female employees are there in the Sales team?
		System.out.println("\n10. How many male and female employees are there in the Sales team?");
		System.out.println(
					data.employeeList.stream()
										.filter(Employee-> Employee.getDepartment().equalsIgnoreCase("IT"))
										.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
				);
		
		
		//11. What is the average salary of male and female employees ?
		System.out.println("\n11. What is the average salary of male and female employees ?");
		System.out.println(
					data.employeeList.stream()
										.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)))
				);
		
		
		//12. List down the names of all employees in each department ?
		System.out.println("\n12. List down the names of all employees in each department ?");
		data.employeeList.stream()
							.map(Employee::getName)
							.forEach(System.out::println);
		
		
		//13. What is the average salary and total salary of the whole organization?
		System.out.println("\n13. What is the average salary and total salary of the whole organization?");
		System.out.println("Average Salary: "+
					data.employeeList.stream()
										.collect(Collectors.averagingDouble(Employee::getSalary))+"\nTotal Salary: "+
										
					data.employeeList.stream()
										.collect(Collectors.summingDouble(Employee::getSalary))
										
				);
		
		
		//14. Get the employee whose salary are more than 25k.
		System.out.println("\n14. Get the employee whose salary are more than 25k.");
		data.employeeList.stream()
							.filter(Employee-> Employee.getSalary()>25000)
							.forEach(System.out::println);
		
		
		//15.Who is the highest paid employee in the organization?
		System.out.println("\n15.Who is the highest paid employee in the organization?");
		System.out.println(
					data.employeeList.stream()
										.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				);
		
		
		//16.Who is the second highest paid employee in the organization?
		System.out.println("\n16.Who is the second highest paid employee in the organization?");
		Employee secondHeighestSalary = data.employeeList.stream()
							.sorted(Comparator.comparing(Employee::getSalary).reversed())
							.skip(1)
							.findFirst()
							.orElse(null);
		System.out.println("Second Heightest Salry: "+secondHeighestSalary);
		
		
		
		//17.Who is the third highest paid employee in the organization?
		System.out.println("\n17.Who is the third highest paid employee in the organization?");
		Employee thirdLargestSalary = data.employeeList.stream()
														.sorted(Comparator.comparing(Employee::getSalary).reversed())
														.skip(2)
														.findFirst()
														.orElse(null);
		System.out.println("Third Largest Salary: "+thirdLargestSalary);
		
		
		
		//18.Who is the lowest paid employee in the organization?
		System.out.println("\n18.Who is the lowest paid employee in the organization?");
		System.out.println(
					data.employeeList.stream()
										.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)))
				);
		
		
		
		//19.Who is the second lowest paid employee in the organization?
		System.out.println("\n19.Who is the second lowest paid employee in the organization?");
		Employee secondLowestSalary = data.employeeList.stream()
															.sorted(Comparator.comparing(Employee::getSalary))
															.skip(1)
															.findFirst()
															.orElse(null);
		System.out.println("Second Lowest Salary: "+secondLowestSalary);
		
		
		
		//20.Get the first five lowest paid employee in the organization?
		System.out.println("\n20.Get the first five lowest paid employee in the organization?");
		data.employeeList.stream()
							.sorted(Comparator.comparing(Employee::getSalary))
							.limit(5)
							.forEach(System.out::println);
		
		
		
		//21.Get the first five highest paid employee in the organization?
		System.out.println("\n21.Get the first five highest paid employee in the organization?");
		data.employeeList.stream()
							.sorted(Comparator.comparing(Employee::getSalary).reversed())
							.limit(5)
							.forEach(System.out::println);
	}
}