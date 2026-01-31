package com.reflectionandannotation.reflection.executiontimer;

import java.lang.reflect.Method;

public class MethodExecutionTimer {

	public static void main(String[] args) {

		try {
			// Create object
			TaskService service = new TaskService();

			// Get class
			Class<?> clazz = service.getClass();

			// Get all declared methods
			Method[] methods = clazz.getDeclaredMethods();

			// Loop through methods
			for (Method method : methods) {

				// Measure start time
				long startTime = System.nanoTime();

				// Invoke method dynamically
				method.invoke(service);

				// Measure end time
				long endTime = System.nanoTime();

				// Calculate execution time
				long duration = endTime - startTime;

				System.out.println("Method: " + method.getName() + " | Execution Time: " + duration + " ns");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}