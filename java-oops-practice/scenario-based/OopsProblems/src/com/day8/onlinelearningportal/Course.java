package com.day8.onlinelearningportal;

import java.util.List;

public abstract class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private List<String> modules;

    protected double rating;        
    private final String internalReview = "Internal Review Approved";

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = List.of("Introduction", "Basics", "Assessment");
    }

    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.size();
    }

    public String getInternalReview() {
        return internalReview;
    }

    public boolean isCourseCompleted(Student student) {
        return student.getCompletedModules() >= getTotalModules();
    }

    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;
        }
    }
}