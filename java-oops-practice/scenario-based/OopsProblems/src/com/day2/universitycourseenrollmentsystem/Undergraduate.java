package com.day2.universitycourseenrollmentsystem;

class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void assignGrade(double marks) {
        // Letter grading
        double gpa = (marks / 100) * 4.0;
        setGPA(gpa);
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student: " + name +
                ", GPA: " + getTranscript());
    }
}
