package com.day2.universitycourseenrollmentsystem;

public class Main{
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Rashi");
        Student s2 = new Postgraduate(102, "Gautam", "AI");

        Course c1 = new Course("CS101", "Data Structures");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        Faculty f1 = new Faculty("Dr. Sharma");

        e1.showEnrollment();
        e2.showEnrollment();

        f1.assignGrade((Graded) s1, 82);
        f1.assignGrade((Graded) s2, 45);

        s1.displayInfo();
        s2.displayInfo();
    }
}
