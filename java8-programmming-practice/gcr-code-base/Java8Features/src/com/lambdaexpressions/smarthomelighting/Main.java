package com.lambdaexpressions.smarthomelighting;

public class Main {

	public static void main(String[] args) {

		SmartHome home = new SmartHome();
		home.run(() -> System.out.println("Motion Detected: Light on"));
		home.run(() -> System.out.println("Night Time: Light on warm"));
		home.run(() -> System.out.println("Voice Command: Light Dim lights"));
	}
}