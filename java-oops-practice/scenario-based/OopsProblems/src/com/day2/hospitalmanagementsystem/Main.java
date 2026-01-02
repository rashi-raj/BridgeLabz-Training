package com.day2.hospitalmanagementsystem;

public class Main{
    public static void main(String[] args){

        Patient p1 = new InPatient(101, "Rashi", 22, 5);
        Patient p2 = new OutPatient(102, "Gautam", 24, 500);

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");

        // Polymorphism
        p1.displayInfo();   
        p2.displayInfo();
        d1.displayInfo();

        Bill bill1 = new Bill(10000);
        System.out.println("Total Bill Amount: Rs" + bill1.calculatePayment());
    }
}

