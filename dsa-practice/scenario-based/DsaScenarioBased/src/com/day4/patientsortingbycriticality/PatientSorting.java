package com.day4.patientsortingbycriticality;

import java.util.ArrayList;
import java.util.List;

public class PatientSorting {
	List<Patient> patients = new ArrayList<>();
	
	void addPatient(String name, int criticality) {
		patients.add(new Patient(name,criticality));
		System.out.println("Patient added successfully!");
	}
	
	void sort() {
		for(int i=0 ; i<patients.size()-1 ; i++) {
			for(int j=0 ; j<patients.size()-i-1 ; j++) {
				if (patients.get(j).criticality < patients.get(j + 1).criticality) {
					Patient temp = patients.get(j);
					patients.set(j, patients.get(j+1));
					patients.set(j+1, temp);
				}
			}
		}
	}
	
	void displaySortedPatients() {
	    System.out.println("Sorted Patients (High → Low Criticality):");

	    for (Patient p : patients) {
	        System.out.println(p.name + " -> " + p.criticality);
	    }
	}
}

