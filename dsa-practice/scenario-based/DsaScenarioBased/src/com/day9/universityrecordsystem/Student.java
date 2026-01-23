package com.day9.universityrecordsystem;

public class Student {
	String name;
	int rollNo;
	Student left;
	Student right;
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		this.left = this.right = null;
	}
	
}
