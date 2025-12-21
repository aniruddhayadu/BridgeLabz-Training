// Program to generate 6-digit OTP numbers and validate uniqueness

import java.util.Scanner;

public class OTPGenerator {
	public static int generateOTP() {
		return 100000 + (int)(Math.random() * 900000);
	}
	
	// Method to check if all OTPs in array are unique
	public static boolean areOTPsUnique(int[] otps) {
		for (int i = 0; i < otps.length; i++) {
            		for (int j = i + 1; j < otps.length; j++) {
                		if (otps[i] == otps[j]) {
                    			return false;
                		}
            		}
        	}
        	return true;
    	}


	public static void main(String[] args) {

        	int[] otpArray = new int[10];

        	// Generate 10 OTPs
        	for (int i = 0; i < 10; i++) {
            		otpArray[i] = generateOTP();
        	}

        	// Display generated OTPs
        	System.out.println("Generated OTPs:");
        	for (int otp : otpArray) {
            		System.out.println(otp);
        	}

        	// Check uniqueness
        	boolean unique = areOTPsUnique(otpArray);
        	System.out.println("Are all OTPs unique? " + (unique ? "Yes" : "No"));
    	}
}