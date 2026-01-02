package com.day2.hospitalmanagementsystem;

class Patient{
    private String name;
    private int age;
    private String medicalHistory; 
    protected int patientId;

    // Normal admission
    Patient(int patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Emergency admission (Constructor Overloading)
    Patient(int patientId, String name, int age, String medicalHistory){
        this(patientId, name, age);
        this.medicalHistory = medicalHistory;
    }

    public String getSummary(){
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Medical History: " + medicalHistory;
    }

    public void displayInfo(){
        System.out.println(getSummary());
    }
}
