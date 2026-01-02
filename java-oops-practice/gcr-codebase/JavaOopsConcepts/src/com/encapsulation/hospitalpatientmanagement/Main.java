package com.encapsulation.hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi Kumar", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Anita Sharma", 30, 500);

        MedicalRecord m1 = (MedicalRecord) p1;
        MedicalRecord m2 = (MedicalRecord) p2;

        m1.addRecord("Admitted for surgery");
        m2.addRecord("Routine health check-up");

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

        }
    }
}
