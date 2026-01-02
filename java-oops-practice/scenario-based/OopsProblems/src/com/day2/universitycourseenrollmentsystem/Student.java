package com.day2.universitycourseenrollmentsystem;

abstract class Student {
    protected int studentId;
    protected String name;
    private double gpa;   // sensitive data

    // Normal student
    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Student with elective preference (Constructor Overloading)
    Student(int studentId, String name, String elective) {
        this(studentId, name);
        System.out.println("Elective chosen: " + elective);
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getTranscript() {
        return gpa;
    }

    public abstract void displayInfo();
}
