package com.functionalInterfaces.passwordstrengthvalidator;

public class PasswordStrengthValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "princi@123";
		if(SecurityUtils.isPasswordValid(password)) {
			System.out.println("Password is valid.. :-).....");
		}
		else {
			System.out.println("Invalid Password bro try again .....");
		}
	}

}
