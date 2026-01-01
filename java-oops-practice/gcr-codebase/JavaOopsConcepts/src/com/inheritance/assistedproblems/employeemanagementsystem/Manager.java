package com.inheritance.assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
	
	private int teamSize;
	
	Manager(String name, int teamSize, double salary, String id){
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("TeamSize : " + teamSize);
	}
}
