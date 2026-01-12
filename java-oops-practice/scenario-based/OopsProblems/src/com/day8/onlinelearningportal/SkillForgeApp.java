package com.day8.onlinelearningportal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Instructor Name: ");
        String instName = sc.nextLine();
        System.out.print("Enter Instructor Email: ");
        String instEmail = sc.nextLine();
        Instructor instructor = new Instructor(instName, instEmail);

        System.out.print("\nEnter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();
        Student student = new Student(studentName, studentEmail);

        System.out.print("\nEnter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter Course Level (1-Beginner, 2-Advanced): ");
        int level = sc.nextInt();
        sc.nextLine();

        Course course;

        if (level == 1) {
            course = new BeginnerCourse(courseTitle, instructor);
        } else {
            System.out.print("Enter number of modules: ");
            int n = sc.nextInt();
            sc.nextLine();

            List<String> modules = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter module " + (i + 1) + ": ");
                modules.add(sc.nextLine());
            }

            course = new AdvancedCourse(courseTitle, instructor, modules);
        }

        instructor.uploadCourse(course);

        System.out.print("\nEnter completed modules count: ");
        int completed = sc.nextInt();

        for (int i = 0; i < completed; i++) {
            student.completeModule();
        }

        if (course.isCourseCompleted(student)) {
            course.generateCertificate(student);
        } else {
            System.out.println("\nCourse not completed yet.");
        }

        sc.close();
    }
}