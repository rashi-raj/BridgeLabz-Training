package com.encapsulation.hospitalpatientmanagement;

class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int numberOfDays, double dailyCharge) {
        super(id, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill(){
        return numberOfDays * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory("InPatient Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records (InPatient):");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
