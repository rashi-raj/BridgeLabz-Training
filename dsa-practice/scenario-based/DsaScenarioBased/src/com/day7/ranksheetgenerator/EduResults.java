package com.day7.ranksheetgenerator;

/*
 EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting
 */

import java.util.*;

public class EduResults {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> finalList = new ArrayList<>();

        System.out.print("Enter number of districts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nDistrict " + (i + 1));
            System.out.print("Enter number of students: ");
            int stu = sc.nextInt();

            List<Student> districtList = new ArrayList<>();

            for (int j = 0; j < stu; j++) {
                sc.nextLine(); // consume newline
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                districtList.add(new Student(name, marks));
            }

            // Sort each district list (descending)
            districtList.sort((a, b) -> b.score - a.score);

            // Merge with final list
            if (i == 0) {
                finalList = districtList;
            } else {
                finalList = MergeList.merge(finalList, districtList);
            }
        }

        // Display Rank Sheet
        System.out.println("\n===== STATE RANK LIST =====");
        int rank = 1;
        for (Student s : finalList) {
            System.out.println(rank++ + ". " + s.name + " - " + s.score);
        }

        sc.close();
    }
}
