package com.streamapi.doctoravailability;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CheckAvailability {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// List to store Doctor objects
		List<Doctor> doctors = new ArrayList<>();
		System.out.println("Enter the no. of Doctor : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter details of Doctor " + (i+1) + " : ");
			System.out.println("Enter name : ");
			String name = sc.nextLine();
			System.out.println("Enter availability (true/false): ");
			String availability = sc.nextLine();
			System.out.println("Enter speciality (Cardiology/Neurology/Orthopedics/Dermatology): ");
			String speciality = sc.nextLine();
			
			// Add doctor to list
			doctors.add(new Doctor(name, availability, speciality));
		}
		doctors.stream()
		       .filter(i -> i.available.equalsIgnoreCase("true"))
		       .sorted(Comparator.comparing(Doctor::getSpeciality))
		       .forEach(System.out::println);
		sc.close();
	}

}