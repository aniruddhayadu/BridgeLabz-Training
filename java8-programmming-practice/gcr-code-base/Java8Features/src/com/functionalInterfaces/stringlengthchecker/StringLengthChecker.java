package com.functionalInterfaces.stringlengthchecker;
import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "AnniWithPrinci";
		Function<String, Integer> a = s-> s.length();		
		System.out.println("Length of string "+ txt + " is :"+ a.apply(txt));
	}

}
