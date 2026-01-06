package com.day5.personalizedlearningplatform;

public class FullTimeCourse implements ICertifiable {

    private String courseName;

    public FullTimeCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for FULL-TIME COURSE: " + courseName);
        System.out.println("Completion type: Academic + Internship");
    }
}