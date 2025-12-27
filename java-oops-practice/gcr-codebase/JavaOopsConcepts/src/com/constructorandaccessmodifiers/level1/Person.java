package com.constructorandaccessmodifiers.level1;

public class Person {

	String personName;
    String gender;
    int age;
    
    // Parameterized Constructor
    Person (String personName, String gender, int age) {
        this.personName = personName;
        this.gender = gender;
        this.age = age;
    }

    // Copy Constructor
    Person (Person previousPerson) {
        this.personName = previousPerson.personName;
        this.gender = previousPerson.gender;
        this.age = previousPerson.age;
    }
    // Display Order Details
    void displayaPersonDetails() {
        System.out.println("Person Name: " + personName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("Alice", "Male", 26);
        System.out.println("\nPerson 1:");
        person1.displayaPersonDetails();

        // Copy Constructor
        Person person2 = new Person(person1);
        System.out.println("\nPerson 2:");
        person2.displayaPersonDetails();

	}

}
