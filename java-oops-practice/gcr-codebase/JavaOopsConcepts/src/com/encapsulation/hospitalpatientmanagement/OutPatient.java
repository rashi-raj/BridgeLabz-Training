package com.encapsulation.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory("OutPatient Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records (OutPatient):");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
