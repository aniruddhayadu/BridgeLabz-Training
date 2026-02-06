package com.multithreading.downloadmanager;
import java.util.Random;

public class FileDownloader {
	private double percentage = 0;
	String name;
	private Random random = new Random();
	
	public FileDownloader(String name) {
		this.name = name;
	}
	
	public void download() {
		while(percentage < 100) {
			percentage += random.nextInt(15) + 1;
			
			if(percentage > 100 ) {
				percentage = 100;
			}
			
			System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + name + ": " + percentage +"%" );
			
			try {
				Thread.sleep(random.nextInt(600)+200);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
