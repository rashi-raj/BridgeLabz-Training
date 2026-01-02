package com.day2.hospitalmanagementsystem;

class OutPatient extends Patient {
    private double consultationFee;

    OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Consultation Fee: Rs" + consultationFee);
    }

    public double getConsultationFee() {
        return consultationFee;
    }
}
