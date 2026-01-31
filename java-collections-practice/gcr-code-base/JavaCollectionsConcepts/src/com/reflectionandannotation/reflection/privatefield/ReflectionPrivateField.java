package com.reflectionandannotation.reflection.privatefield;

import java.lang.reflect.Field;

public class ReflectionPrivateField {

	
	public static void main(String[] args) {

		try {
			// Create Person object
			Person person = new Person();

			// Get Class object
			Class<?> cls = person.getClass();

			// Get private field 'age'
			Field ageField = cls.getDeclaredField("age");

			// Make private field accessible
			ageField.setAccessible(true);

			// Modify the value of age
			ageField.set(person, 30);

			// Retrieve updated value
			int updatedAge = (int) ageField.get(person);

			// Print result
			System.out.println("Updated Age: " + updatedAge);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}