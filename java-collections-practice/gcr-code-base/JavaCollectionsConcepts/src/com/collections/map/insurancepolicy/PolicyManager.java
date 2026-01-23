package com.collections.map.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

	private Map<Integer, Policy> hashMap = new HashMap<>();
	private Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>(); 
	private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();
	
	public void addPolicy(Policy policy) {

		hashMap.put(policy.getPolicyNumber(), policy);
		linkedHashMap.put(policy.getPolicyNumber(), policy);

		treeMap.putIfAbsent(policy.getExpiryDate(), new ArrayList<>());
		treeMap.get(policy.getExpiryDate()).add(policy);
	}

	public Policy getPolicyByNumber(int policyNumber) {
		return hashMap.get(policyNumber);
	}
	
	public void policiesExpiringSoon() {

		System.out.println("\nPolicies Expiring in Next 30 Days:");
		LocalDate today = LocalDate.now();
		LocalDate limit = today.plusDays(30);

		for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {
			if (!entry.getKey().isAfter(limit)) {
				for (Policy p : entry.getValue()) {
					System.out.println(p);
				}
			}
		}
	}

	public void policiesByHolder(String name) {

		System.out.println("\nPolicies for Policyholder: " + name);
		for (Policy p : hashMap.values()) {
			if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
				System.out.println(p);
			}
		}
	}

	public void removeExpiredPolicies() {

		LocalDate today = LocalDate.now();

		Iterator<Map.Entry<Integer, Policy>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Policy> entry = iterator.next();

			if (entry.getValue().getExpiryDate().isBefore(today)) {
				iterator.remove();
				linkedHashMap.remove(entry.getKey());
			}
		}

		treeMap.headMap(today).clear();

		System.out.println("\nExpired policies removed.");
	}

	public void displayAllPolicies() {
		System.out.println("\nAll Policies (Insertion Order):");
		for (Policy p : linkedHashMap.values()) {
			System.out.println(p);
		}
	}
}
