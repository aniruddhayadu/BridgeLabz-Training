package com.reflectionandannotation.reflection.staticfield;

import java.lang.reflect.Field;

public class StaticFieldReflection {

	public static void main(String[] args) {

		try {
			// Get Class object
			Class<?> cls = Configuration.class;

			// Get private static field API_KEY
			Field field = cls.getDeclaredField("API_KEY");

			// Make it accessible
			field.setAccessible(true);

			// Modify static field (object reference is null)
			field.set(null, "NEW_SECRET_API_KEY");

			// Retrieve updated value
			String updatedKey = (String) field.get(null);

			// Print updated value
			System.out.println("Updated API_KEY: " + updatedKey);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}