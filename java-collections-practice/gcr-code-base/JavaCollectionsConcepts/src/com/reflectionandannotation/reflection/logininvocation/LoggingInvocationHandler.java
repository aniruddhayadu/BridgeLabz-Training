package com.reflectionandannotation.reflection.logininvocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

	private final Object target;

	// Constructor accepts real object
	public LoggingInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// 🔹 Log before method execution
		System.out.println("Calling method: " + method.getName());

		// Invoke actual method on real object
		return method.invoke(target, args);
	}
}