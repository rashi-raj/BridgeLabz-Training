package com.day9.universityrecordsystem;

/*
 * Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance.
 */
import java.util.Scanner;

public class UniversityApp {

    public static void main(String[] args) {

        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== University Record System =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNo = sc.nextInt();
                    bst.insert(bst.root, name, rollNo);
                    System.out.println("Student inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();
                    Student s = bst.search(bst.root, searchRoll);
                    if (s != null)
                        System.out.println("Found → Name: " + s.name);
                    else
                        System.out.println("Student not found.");
                    break;

                case 3:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = sc.nextInt();
                    bst.delete(bst.root, deleteRoll);
                    System.out.println("Record deleted (if existed).");
                    break;

                case 4:
                    System.out.println("\nStudent Records (Sorted by Roll No):");
                    bst.display();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
