package com.collectors.employeesalarycategorization;
import java.util.*;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(new Employee("Aniruddha", "IT", 9), new Employee("Divyanshu", "IT", 99000),
				new Employee("Pinku", "HR", 95000), new Employee("Rohan", "HR", 91000),
				new Employee("Aditya", "Finance", 90000));

		Map<String, Double> avgSalaryByDept = EmployeeService.getAverageSalaryByDepartment(employees);

		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " Average Salary: ₹" + avgSalary));
	}

}
