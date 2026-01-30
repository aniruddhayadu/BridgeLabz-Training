package com.reflectionandannotation.annotation.supresswarning;

import java.util.ArrayList;

public class UncheckedWarning {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); //  unchecked warning

		list.add("Java");
		list.add(10); // mixed types allowed

		String value = (String) list.get(0);
		System.out.println(value);
	}
}