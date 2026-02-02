package com.streamAPI.hospitaldoctoravailability;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HospitalDoctorAvailablityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Doctor> doctorList = new ArrayList<>();
		
		doctorList.add(new Doctor("Princi", true, "Ayurveda"));
		doctorList.add(new Doctor("Anni",false,"Krotho"));
		doctorList.add(new Doctor("Arif",true,"Spetho"));
		doctorList.add(new Doctor("Aditya",false,"Aortho"));
		doctorList.add(new Doctor("Ganesh",true,"Geortho"));
		
		doctorList.stream()
		.filter(Doctor-> Doctor.isAvailableOnWeekend()==true)
		.sorted(Comparator.comparing(Doctor::getSpecialty))
		.forEach(System.out::println);
	}

}
