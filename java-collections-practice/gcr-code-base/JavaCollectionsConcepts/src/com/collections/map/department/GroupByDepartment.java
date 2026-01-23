package com.collections.map.department;

import java.util.*;

public class GroupByDepartment {

	static Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {

		Map<String, List<Employee>> departmentMap = new HashMap<>();

		for (Employee emp : employees) {

			String dept = emp.getDepartment();
			departmentMap.putIfAbsent(dept, new ArrayList<>());
			departmentMap.get(dept).add(emp);
		}

		return departmentMap;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", "HR"));
		employees.add(new Employee("Bob", "IT"));
		employees.add(new Employee("Carol", "HR"));

		Map<String, List<Employee>> grouped = groupEmployeesByDepartment(employees);
		for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}