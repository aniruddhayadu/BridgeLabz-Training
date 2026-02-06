package com.multithreading.downloadmanager;

public class DownloadManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new FileThread(new FileDownloader("documents.pdf")));
		Thread thread2 = new Thread(new FileThread(new FileDownloader("image.jpg")));
		Thread thread3 = new Thread(new FileThread(new FileDownloader("divyanshu.png")));
		Thread thread4 = new Thread(new FileThread(new FileDownloader("audio.mp3")));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
		System.out.println("- - -");
		System.out.println("All file Downloading completed...");
	}

}
