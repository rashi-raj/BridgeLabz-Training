package com.inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee{
	
	private String programmingLanguage;
	
	Developer(String name, double salary, String programmingLanguage, String id){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language : " + programmingLanguage);
	}
}
