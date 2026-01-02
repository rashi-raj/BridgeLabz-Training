package com.day2.universitycourseenrollmentsystem;

class Postgraduate extends Student implements Graded {

    Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void assignGrade(double marks) {
        // Pass / Fail grading
        double gpa = (marks >= 50) ? 4.0 : 0.0;
        setGPA(gpa);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate Student: " + name +
                ", GPA: " + getTranscript());
    }
}
