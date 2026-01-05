package com.day4.collegeinformationsystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CampusConnectApp {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty Input
        System.out.println("Enter Faculty Details:");
        System.out.print("ID: ");
        int fId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String fName = sc.nextLine();

        System.out.print("Email: ");
        String fEmail = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fId, fName, fEmail, dept);

        // Course Input
        System.out.print("\nEnter Course Name: ");
        String courseName = sc.nextLine();

        Course course = new Course(courseName, faculty);

        // Student Input 
        System.out.print("\nEnter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Student " + (i + 1) + " Details:");

            System.out.print("ID: ");
            int sId = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String sName = sc.nextLine();

            System.out.print("Email: ");
            String sEmail = sc.nextLine();

            Student student = new Student(sId, sName, sEmail);
            student.enrollCourse(course);

            System.out.print("Enter number of subjects: ");
            int subCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < subCount; j++) {
                System.out.print("Subject Name: ");
                String subject = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                student.addGrade(subject, marks);
            }

            students.add(student);
        }

        // Display Details 
        faculty.printDetails();

        for (Student s : students) {
            s.printDetails();
        }

        course.showCourseDetails();

        sc.close();
    }
}
