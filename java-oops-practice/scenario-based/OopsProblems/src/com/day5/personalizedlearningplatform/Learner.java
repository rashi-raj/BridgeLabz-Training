package com.day5.personalizedlearningplatform;

import java.util.ArrayList;
import java.util.List;

public class Learner extends User {

    private List<FullTimeCourse> enrolledFullTimeCourses;
    private List<ShortCourse> enrolledShortCourses;

    public Learner(String name, String email, String userID) {
        super(name, email, userID);
        enrolledFullTimeCourses = new ArrayList<>();
        enrolledShortCourses = new ArrayList<>();
    }

    public void enrollFullTimeCourse(FullTimeCourse course) {
        enrolledFullTimeCourses.add(course);
        course.generateCertificate();   // Polymorphism
    }

    public void enrollShortCourse(ShortCourse course) {
        enrolledShortCourses.add(course);
        course.generateCertificate();   // Polymorphism
    }
}