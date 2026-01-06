package com.day5.personalizedlearningplatform;

public class ShortCourse implements ICertifiable {

    private String courseName;

    public ShortCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for SHORT COURSE: " + courseName);
        System.out.println("Completion type: Skill-based");
    }
}