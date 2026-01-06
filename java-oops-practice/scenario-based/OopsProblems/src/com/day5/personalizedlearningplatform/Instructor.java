package com.day5.personalizedlearningplatform;

public class Instructor extends User {

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void createCourse(String courseName) {
        System.out.println("Instructor " + name + " created course: " + courseName);
    }
}