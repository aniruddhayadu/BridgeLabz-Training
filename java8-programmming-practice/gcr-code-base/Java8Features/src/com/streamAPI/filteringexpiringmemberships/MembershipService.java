package com.streamAPI.filteringexpiringmemberships;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

// Service class for membership filtering
public class MembershipService {

	// Filter members expiring within next 30 days
	public static List<Member> getExpiringMembers(List<Member> members) {
		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);

		return members.stream()
				.filter(m -> !m.getExpiryDate().isBefore(today) && !m.getExpiryDate().isAfter(next30Days))
				.collect(Collectors.toList());
	}
}
