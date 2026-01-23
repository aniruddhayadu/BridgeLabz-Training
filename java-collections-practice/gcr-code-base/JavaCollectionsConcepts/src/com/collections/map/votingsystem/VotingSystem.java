package com.collections.map.votingsystem;

import java.util.*;

class VotingSystem {

	private HashMap<String, Integer> voteMap = new HashMap<>();

	private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

	public void castVote(String candidate) {

		voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

		voteOrderMap.put(candidate, voteMap.get(candidate));
	}

	public void displayVoteOrder() {
		System.out.println("\nVotes in Insertion Order:");
		for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

	public void displaySortedResults() {
		System.out.println("\nSorted Election Results:");

		TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

	public void displayWinner() {
		String winner = null;
		int maxVotes = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
			if (entry.getValue() > maxVotes) {
				maxVotes = entry.getValue();
				winner = entry.getKey();
			}
		}

		System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
	}
}
