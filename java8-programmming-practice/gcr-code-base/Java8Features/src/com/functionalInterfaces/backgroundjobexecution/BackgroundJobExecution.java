package com.functionalInterfaces.backgroundjobexecution;

public class BackgroundJobExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {System.out.println("Background job running");};
		
		System.out.println(task);
		System.out.println("Main thread continue running");
	}

}
