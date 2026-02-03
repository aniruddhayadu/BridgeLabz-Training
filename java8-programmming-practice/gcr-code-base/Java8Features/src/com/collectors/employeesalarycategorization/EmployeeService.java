package com.collectors.employeesalarycategorization;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
	public static Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
		return employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	}
}
