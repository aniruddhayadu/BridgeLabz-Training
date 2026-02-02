package com.functionalInterfaces.sensitivedatatagging;

public class EncryptionService {
	 public static void encryptIfSensitive(Object obj) {

	        if (obj instanceof SensitiveData) {
	            System.out.println("Encrypting sensitive data for class: "
	                    + obj.getClass().getSimpleName());
	            // encryption logic here
	        } else {
	            System.out.println("No encryption needed");
	        }
	    }
}
