package com.streamAPI.insuranceclaimanalysis;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysisApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Claim> claimList = new ArrayList<>();
		
		claimList.add(new Claim(101, "Anniruddha","Bike Insurance",123584));
		claimList.add(new Claim(105, "Payal","Home Insurance",248864));
		claimList.add(new Claim(103, "Divyanshu","Term Insurance",481234));
		claimList.add(new Claim(102, "Trisha","Life Insurance",451234));
		claimList.add(new Claim(104, "Tripti","Home Insurance",155234));
		claimList.add(new Claim(107, "Aditya","Bike Insurance",1234));
		claimList.add(new Claim(106, "Pinki","Health Insurance",591234));
		
		System.out.println(
				claimList.stream()
						.collect(Collectors.groupingBy(Claim::getType, Collectors.averagingDouble(Claim::getAmount)))
			);
	}

}
