package com.day10.hospitalqueuemanagement;
public class HospitalDemo {
    public static void main(String[] args) {
        HospitalQueueAVL hospital = new HospitalQueueAVL();
        hospital.insert(new Patient("John", 9));
        hospital.insert(new Patient("Emma", 8));
        hospital.insert(new Patient("Liam", 10));

        System.out.println("Patients by arrival:");
        hospital.displayQueue();

        System.out.println("\nDischarging Emma (8):");
        hospital.delete(8);
        hospital.displayQueue();
    }
}