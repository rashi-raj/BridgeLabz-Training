package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (no direct setters for sensitive info)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Protected access for subclasses
    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId +
                           ", Name: " + name +
                           ", Age: " + age);
    }
}
