package com.streamAPI.hospitaldoctoravailability;

public class Doctor {
	private String doctorName;
	private boolean isAvailableOnWeekend;
	private String specialty;
	
	public Doctor(String doctorName, boolean isAvailableOnWeekend, String specialty) {
		this.doctorName = doctorName;
		this.isAvailableOnWeekend = isAvailableOnWeekend;
		this.specialty = specialty;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public boolean isAvailableOnWeekend() {
		return isAvailableOnWeekend;
	}

	public void setAvailableOnWeekend(boolean isAvailableOnWeekend) {
		this.isAvailableOnWeekend = isAvailableOnWeekend;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", isAvailableOnWeekend=" + isAvailableOnWeekend + ", specialty="
				+ specialty + "]";
	}
}