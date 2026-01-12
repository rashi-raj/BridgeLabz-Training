package com.day8.onlinelearningportal;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("\n----- BEGINNER CERTIFICATE -----");
        System.out.println("Student: " + student.getName());
        System.out.println("Course : " + getTitle());
        System.out.println("--------------------------------");
    }
}