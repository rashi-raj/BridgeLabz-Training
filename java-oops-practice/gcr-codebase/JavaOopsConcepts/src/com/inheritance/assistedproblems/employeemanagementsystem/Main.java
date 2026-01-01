package com.inheritance.assistedproblems.employeemanagementsystem;

public class Main {
	public static void main(String[] args) {
		Employee e = new Developer("Mike", 35000,"Java","D01");
		
		Employee m = new Manager("Steve", 5 ,45000,"M01");
		
		Employee i = new Intern("Will", "I01", 18000, 2);
		
		System.out.println("Employee -> ");
		e.displayDetails();
		System.out.println("\nManager -> ");
		m.displayDetails();
		System.out.println("\nIntern -> ");
		i.displayDetails();
	}
}

