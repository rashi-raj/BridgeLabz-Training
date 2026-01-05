package com.day4.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Student extends Person implements ICourseActions {

	 private Map<String, Integer> grades; // Encapsulation
	 private List<Course> enrolledCourses;

	 Student(int id, String name, String email) {
	     super(id, name, email);
	     grades = new HashMap<>();
	     enrolledCourses = new ArrayList<>();
	 }

	 public void addGrade(String subject, int marks) {
	     grades.put(subject, marks);
	 }

	 public double calculateGPA() {
	     int total = 0;
	     for (int marks : grades.values()) {
	         total += marks;
	     }
	     return grades.size() == 0 ? 0.0 : (double) total / grades.size();
	 }

	 @Override
	 public void enrollCourse(Course course) {
	     enrolledCourses.add(course);
	     course.addStudent(this);
	   
	 }

	 @Override
	 public void dropCourse(Course course) {
	     enrolledCourses.remove(course);
	     course.removeStudent(this);
	     
	 }

	 @Override
	 void printDetails() {
		 System.out.println("\n--- Student Details ---");
	     System.out.println("Student ID: " + id);
	     System.out.println("Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("GPA: " + calculateGPA());
	 }
	}

