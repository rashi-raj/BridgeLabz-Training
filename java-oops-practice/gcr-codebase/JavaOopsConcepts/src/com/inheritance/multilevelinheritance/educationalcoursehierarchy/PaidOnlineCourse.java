package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; 

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: Rs" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs" + (fee - (fee * discount / 100)));
    }
}