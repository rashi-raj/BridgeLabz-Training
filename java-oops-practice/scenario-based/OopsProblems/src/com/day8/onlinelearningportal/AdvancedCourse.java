package com.day8.onlinelearningportal;

import java.util.List;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("\n===== ADVANCED CERTIFICATE =====");
        System.out.println("Student: " + student.getName());
        System.out.println("Course : " + getTitle());
        System.out.println("================================");
    }
}
