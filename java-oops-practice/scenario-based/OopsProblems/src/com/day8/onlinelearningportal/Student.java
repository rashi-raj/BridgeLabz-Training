package com.day8.onlinelearningportal;

public class Student extends User {

    private int completedModules;

    public Student(String name, String email) {
        super(name, email);
    }

    public void completeModule() {
        completedModules++;
    }

    public int getCompletedModules() {
        return completedModules;
    }
}