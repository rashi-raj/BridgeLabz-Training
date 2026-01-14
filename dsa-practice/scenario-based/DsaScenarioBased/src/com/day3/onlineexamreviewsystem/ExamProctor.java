package com.day3.onlineexamreviewsystem;

import java.util.*;

public class ExamProctor {

    Stack<Integer> navStack = new Stack<>();

    HashMap<Integer, String> questions = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();
    HashMap<Integer, String> studentAnswers = new HashMap<>();

    ExamProctor() {

        questions.put(1, "What is the size of int in Java?\nA) 2 bytes  B) 4 bytes  C) 8 bytes  D) Depends");
        questions.put(2, "Which keyword is used to inherit a class?\nA) this  B) super  C) extends  D) implements");
        questions.put(3, "Which collection does not allow duplicates?\nA) List  B) Set  C) Map  D) ArrayList");
        questions.put(4, "Which method starts a thread?\nA) run()  B) start()  C) execute()  D) init()");
        
        // correct answers
        correctAnswers.put(1, "B");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "B");
    }

    void showQuestion(int qid) {

        if (!questions.containsKey(qid)) {
            System.out.println("Invalid Question ID");
            return;
        }

        navStack.push(qid);
        System.out.println("\nQuestion " + qid + ":");
        System.out.println(questions.get(qid));
    }

    void answerQuestion(int qid, String answer) {

        if (!questions.containsKey(qid)) {
            System.out.println("Invalid Question ID");
            return;
        }

        studentAnswers.put(qid, answer.toUpperCase());
        System.out.println("Answer saved");
    }

    void goBack() {

        if (navStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }

        System.out.println("Went back from Question " + navStack.pop());
    }

    void submitExam() {

        int score = calculateScore();
        System.out.println("\nExam Submitted");
        System.out.println("Final Score = " + score + "/" + questions.size());
    }

     // scoring logic
    int calculateScore() {

        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (correctAnswers.get(qid)
                    .equals(studentAnswers.get(qid))) {
                score++;
            }
        }
        return score;
    }
}
