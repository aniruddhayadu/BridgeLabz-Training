package com.multithreading.downloadmanager;

public class FileThread implements Runnable {
	FileDownloader fileDownloader;
	
	public FileThread(FileDownloader downloader) {
		this.fileDownloader = downloader;
	}
	
	public void run() {
		fileDownloader.download();
	}
}
