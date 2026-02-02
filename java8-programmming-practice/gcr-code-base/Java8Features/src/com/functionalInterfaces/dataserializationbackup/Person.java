package com.functionalInterfaces.dataserializationbackup;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Person() {
		System.out.println("Person object created.");
	}
}
