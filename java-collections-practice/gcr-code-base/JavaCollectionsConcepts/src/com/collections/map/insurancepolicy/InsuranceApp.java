package com.collections.map.insurancepolicy;

import java.time.LocalDate;

public class InsuranceApp {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		Policy p1 = new Policy(201, "Nikki Shrivas", LocalDate.now().plusDays(15), "Health", 12000);

		Policy p2 = new Policy(202, "Anni Yadav", LocalDate.now().plusDays(45), "Auto", 8000);

		Policy p3 = new Policy(203, "Nikki Shrivas", LocalDate.now().minusDays(5), "Home", 15000);

		manager.addPolicy(p1);
		manager.addPolicy(p2);
		manager.addPolicy(p3);

		manager.displayAllPolicies();

		System.out.println("\nRetrieve Policy 201:");
		System.out.println(manager.getPolicyByNumber(201));

		manager.policiesExpiringSoon();

		manager.policiesByHolder("Nikki Shrivas");

		manager.removeExpiredPolicies();

		manager.displayAllPolicies();
	}
}