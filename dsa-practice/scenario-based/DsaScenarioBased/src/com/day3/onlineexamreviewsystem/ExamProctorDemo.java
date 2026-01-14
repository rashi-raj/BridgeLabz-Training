package com.day3.onlineexamreviewsystem;

import java.util.Scanner;

public class ExamProctorDemo {

    public static void main(String[] args) {
    	// Create scanner object
        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();

        while (true) {

            System.out.println("\n--- Online Exam Menu ---");
            System.out.println("1. View Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go Back");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            // Exit
            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }
            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Question ID (1–4): ");
                    exam.showQuestion(sc.nextInt());
                }

                case 2 -> {
                    System.out.print("Enter Question ID: ");
                    int qid = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    exam.answerQuestion(qid, sc.next());
                }

                case 3 -> exam.goBack();

                case 4 -> exam.submitExam();

                case 5 -> {
                    System.out.println("Exam session closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
        
        //Close scanner object
        sc.close();
    }
}
