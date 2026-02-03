package com.streamAPI.filteringexpiringmemberships;
import java.time.LocalDate;
import java.util.*;

public class GymApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> members = Arrays.asList(new Member("Anni", LocalDate.now().plusDays(10)),
				new Member("Pinku", LocalDate.now().plusDays(45)), new Member("Princi", LocalDate.now().plusDays(25)),
				new Member("Karan", LocalDate.now().minusDays(5)));

		// Get members whose membership expires in next 30 days
		List<Member> expiringMembers = MembershipService.getExpiringMembers(members);

		expiringMembers.forEach(System.out::println);
	}

}
