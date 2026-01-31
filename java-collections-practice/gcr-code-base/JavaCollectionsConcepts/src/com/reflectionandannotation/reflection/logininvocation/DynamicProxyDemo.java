package com.reflectionandannotation.reflection.logininvocation;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

	public static void main(String[] args) {

		// Real object
		Greeting realGreeting = new GreetingImpl();

		// Create proxy object
		Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
				new Class<?>[] { Greeting.class }, new LoggingInvocationHandler(realGreeting));

		// Call method via proxy
		proxyGreeting.sayHello("Aniruddha Yaduwanshi");
	}
}
