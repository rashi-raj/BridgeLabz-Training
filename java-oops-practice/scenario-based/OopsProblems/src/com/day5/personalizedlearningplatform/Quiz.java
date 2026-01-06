package com.day5.personalizedlearningplatform;

import java.util.Scanner;

public class Quiz {

    private String[] questions;
    private final String[] answers;   
    private int score;

    private static final String[] EASY_BANK = {
        "What is JVM?",
        "What is JDK?"
    };

    private static final String[] MEDIUM_BANK = {
        "Explain OOPs concept",
        "What is polymorphism?"
    };

    private static final String[] HARD_BANK = {
        "Explain JVM architecture",
        "Difference between HashMap and Hashtable"
    };

    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("easy"))
            questions = EASY_BANK;
        else if (difficulty.equalsIgnoreCase("medium"))
            questions = MEDIUM_BANK;
        else
            questions = HARD_BANK;

        answers = new String[questions.length];
    }

    public void takeQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            answers[i] = sc.nextLine();
        }
        sc.close();
    }

    public void calculateScore(String[] correctAnswers) {
        score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (answers[i] != null && answers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / questions.length;
    }
    
    
}