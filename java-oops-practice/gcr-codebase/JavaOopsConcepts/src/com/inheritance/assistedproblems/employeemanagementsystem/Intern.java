package com.inheritance.assistedproblems.employeemanagementsystem;

public class Intern extends Employee{

	private int internshipDuration;
	
	Intern(String name, String id, double salary, int internshipDuration){
		super(name, id, salary);
		this.internshipDuration = internshipDuration;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Internship Duration(months) : " + internshipDuration);
	}
	
}
