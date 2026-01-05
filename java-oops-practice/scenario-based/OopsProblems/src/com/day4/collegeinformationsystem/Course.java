package com.day4.collegeinformationsystem;

import java.util.List;
import java.util.ArrayList;

public class Course{
	
	private String courseName;
	 private Faculty faculty;
	 private List<Student> students;

	 Course(String courseName, Faculty faculty) {
	     this.courseName = courseName;
	     this.faculty = faculty;
	     students = new ArrayList<>();
	 }

	 public String getCourseName() {
	     return courseName;
	 }

	 public void addStudent(Student student) {
	     students.add(student);
	 }

	 public void removeStudent(Student student) {
	     students.remove(student);
	 }

	 public void showCourseDetails() {
		 System.out.println("\n--- Course Details ---");
	     System.out.println("\nCourse: " + courseName);
	     System.out.println("Faculty: " + faculty.name);
	     System.out.println("Enrolled Students: " + students.size());
	 }
}