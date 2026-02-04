package com.employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeDataCenter {
	List<Employee> employeeList = new ArrayList<>();
	
	//add 
	public void add(Employee e) {
		employeeList.add(e);
	}
	
	//remove 
	public void remove(int empId) {
		for(Employee e : employeeList) {
			if(e.getId()==empId) {
				employeeList.remove(e);
				return;
			}
		}
	}
	
	//
}
