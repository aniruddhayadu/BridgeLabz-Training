package com.functionalInterfaces.passwordstrengthvalidator;

public interface SecurityUtils {
	static boolean isPasswordValid(String password) {
		if(password.length() < 8) {
			return false;
		}
		return true;
	}
}
