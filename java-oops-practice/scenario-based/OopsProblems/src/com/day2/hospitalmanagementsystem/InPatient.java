package com.day2.hospitalmanagementsystem;

class InPatient extends Patient {
    private int daysAdmitted;

    InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Days Admitted: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
