package com.day4.collegeinformationsystem;

class Faculty extends Person {

	 private String department;

	 Faculty(int id, String name, String email, String department) {
	     super(id, name, email);
	     this.department = department;
	 }

	 @Override
	 void printDetails() {
		 System.out.println("\n--- Faculty Details ---");
	     System.out.println("Faculty ID: " + id);
	     System.out.println("Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("Department: " + department);
	 }
}
