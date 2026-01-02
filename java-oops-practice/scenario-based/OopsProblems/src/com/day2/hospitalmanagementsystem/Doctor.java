package com.day2.hospitalmanagementsystem;

class Doctor {
    private String name;
    private String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}
