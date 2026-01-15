package com.birdsanctuary;

public class Eagle extends Bird implements Flyable {

	 public Eagle(String id, String name) {
	     super(id, name, "Eagle");
	 }

	 public void fly() {
	     System.out.println(getName() + " flies short distances.");
	 }

	 public void swim() {
	     System.out.println(getName() + " swims in the pond.");
	 }
	}