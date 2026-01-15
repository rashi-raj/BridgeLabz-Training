package com.day4.patientsortingbycriticality;

import java.util.Scanner;

public class HospitalQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientSorting ps = new PatientSorting();

        while(true) {
            System.out.println("\n===== Hospital Patient Queue =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Sort Patients by Criticality");
            System.out.println("3. Display Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 
            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter criticality: ");
                    int criticality = sc.nextInt();

                    ps.addPatient(name, criticality);
                    break;

                case 2:
                    ps.sort();
                    System.out.println("Patients sorted by criticality (High → Low).");
                    ps.displaySortedPatients();
                    break;

                case 3:
                    ps.displaySortedPatients();
                    break;

                case 4:
                    System.out.println("Exiting system. Stay safe!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        
        sc.close();
    }
}
 