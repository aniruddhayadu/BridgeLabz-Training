package com.reflectionandannotation.reflection.calculator;

import java.lang.reflect.Method;

public class ReflectionPrivateMethod {

	public static void main(String[] args) {

		try {
			// Create Calculator object
			Calculator calculator = new Calculator();

			// Get Class object
			Class<?> cls = calculator.getClass();

			// Get private method multiply(int, int)
			Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

			// Make private method accessible
			method.setAccessible(true);

			// Invoke method
			Object result = method.invoke(calculator, 5, 4);

			// Print result
			System.out.println("Result: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}