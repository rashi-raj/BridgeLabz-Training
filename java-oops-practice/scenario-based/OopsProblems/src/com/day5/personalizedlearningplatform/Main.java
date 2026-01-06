package com.day5.personalizedlearningplatform;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter learner name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Learner learner = new Learner(name, email, "L101");

        // Course selection
        System.out.println("Choose course type: 1. Short  2. Full-Time");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            ShortCourse scourse = new ShortCourse("Java Basics");
            learner.enrollShortCourse(scourse);
        } else {
            FullTimeCourse fcourse = new FullTimeCourse("Full Stack Java");
            learner.enrollFullTimeCourse(fcourse);
        }

        // Quiz section
        System.out.print("Choose quiz difficulty (easy / medium / hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(difficulty);
        quiz.takeQuiz();

        String[] correctAnswers = {
            "Java Virtual Machine",
            "Java Development Kit"
        };

        quiz.calculateScore(correctAnswers);

        System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");

        sc.close();
    }
}
