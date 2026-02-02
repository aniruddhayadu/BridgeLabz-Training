package com.functionalInterfaces.cloningprototypeobjects;

public class CloningPrototypeObject {

	public static void main(String[] args) throws CloneNotSupportedException{
		Policy policy = new Policy(101,"King Khan");
		
		Policy copy = (Policy)policy.clone();
		
		System.out.println(copy.policyHolder+"\n"+copy.policyId);
	}

}
