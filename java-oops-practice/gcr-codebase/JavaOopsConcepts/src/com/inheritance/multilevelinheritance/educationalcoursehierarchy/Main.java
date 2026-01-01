package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Main{
    public static void main(String[] args) {

        Course course = new PaidOnlineCourse( "Java Full Stack", 120, "Coursera", true, 10000, 20);

        course.displayDetails();
    }
}