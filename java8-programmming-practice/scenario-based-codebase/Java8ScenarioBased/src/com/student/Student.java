package com.student;

public class Student {
	
	private String Name;
	private int id;
	private String firstName;
	private int age;
	private String gender;
	private String city;
	private double rank;
	private String contacts;
	private String department;
	public Student(String name, int id, String firstName, int age, String gender, String city, double rank,
			String contacts, String department) {
		Name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
		this.department = department;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", id=" + id + ", firstName=" + firstName + ", age=" + age + ", gender="
				+ gender + ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + ", department=" + department
				+ "]";
	}
}
