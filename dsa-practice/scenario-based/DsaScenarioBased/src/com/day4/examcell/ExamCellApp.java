package com.day4.examcell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamCellApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        StudentMergeSort sorter = new StudentMergeSort();

        while (true) {
            System.out.println("\n===== ExamCell Rank Generator =====");
            System.out.println("1. Add Student Score");
            System.out.println("2. Generate Rank List");
            System.out.println("3. Display Rank List");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter score: ");
                    int score = sc.nextInt();

                    students.add(new Student(roll, name, score));
                    System.out.println("Student added.");
                    break;

                case 2:
                    sorter.mergeSort(students);
                    System.out.println("Rank list generated successfully.");
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        System.out.println("\nState-Level Rank List:");
                        int rank = 1;
                        for (Student s : students) {
                            System.out.println(
                                "Rank " + rank++ + " → " + s
                            );
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting ExamCell system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
