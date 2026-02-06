package com.multithreading.printshop;

public class PrintShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		 Thread job1 = new Thread(new PrintJob("Job1", 10, 5), "Job1");
		 Thread job2 = new Thread(new PrintJob("Job2", 5, 8), "Job2");
		 Thread job3 = new Thread(new PrintJob("Job3", 15, 3), "Job3");
		 Thread job4 = new Thread(new PrintJob("Job4", 8, 6), "Job4");
		 Thread job5 = new Thread(new PrintJob("Job5", 12, 7), "Job5");

		 job1.setPriority(5);
		 job2.setPriority(8);
		 job3.setPriority(3);
		 job4.setPriority(6);
		 job5.setPriority(7);	 
		 
		 try {
			 job1.join();
			 job2.join();
			 job3.join();
			 job4.join();
			 job5.join();
		 }
		 catch (InterruptedException e) {
			 e.printStackTrace();
		 }

		 long endTime = System.currentTimeMillis();
		 
		 System.out.println(" All Job completed in " + (endTime - startTime) + "ms");
	}

}
