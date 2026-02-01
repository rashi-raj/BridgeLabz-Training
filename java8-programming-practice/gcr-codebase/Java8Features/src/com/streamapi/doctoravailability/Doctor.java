package com.streamapi.doctoravailability;

public class Doctor {
	String name;
	String available;
	String speciality;
	
	// Constructor to initialize Doctor object
	public Doctor(String name, String available, String speciality) {
		this.name = name;
		this.available = available;
		this.speciality = speciality;
	}

	// Getter method to fetch speciality
	public String getSpeciality() {
		return speciality;
	}

	// Overriding toString() for readable output
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", available=" + available + ", speciality=" + speciality + "]";
	}
}
