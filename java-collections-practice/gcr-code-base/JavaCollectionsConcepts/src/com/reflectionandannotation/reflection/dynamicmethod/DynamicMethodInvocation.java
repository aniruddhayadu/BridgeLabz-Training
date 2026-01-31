package com.reflectionandannotation.reflection.dynamicmethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Create object normally
			MathOperations obj = new MathOperations();

			// Get class object
			Class<?> cls = obj.getClass();

			// Take method name from user
			System.out.print("Enter method name (add / subtract / multiply): ");
			String methodName = sc.nextLine();

			// Take input numbers
			System.out.print("Enter first number: ");
			int a = sc.nextInt();

			System.out.print("Enter second number: ");
			int b = sc.nextInt();

			// Get method dynamically (method name + parameter types)
			Method method = cls.getMethod(methodName, int.class, int.class);

			// Invoke method dynamically
			Object result = method.invoke(obj, a, b);

			// Print result
			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println("Invalid method name!");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sc.close();
		}
	}
}
