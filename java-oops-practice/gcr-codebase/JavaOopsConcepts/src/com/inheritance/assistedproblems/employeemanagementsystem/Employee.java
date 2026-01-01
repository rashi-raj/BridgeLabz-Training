package com.inheritance.assistedproblems.employeemanagementsystem;

public class Employee {
	protected String name;
	protected String id;
	protected double salary;
	
	Employee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Salary : " + salary);
	}
}
