package com.day2.universitycourseenrollmentsystem;

class Faculty {
    private String name;

    Faculty(String name) {
        this.name = name;
    }

    public void assignGrade(Graded student, double marks) {
        student.assignGrade(marks); // Polymorphism
    }
}
