package com.day4.examcell;

public class Student {
    int rollNo;
    String name;
    int score;

    public Student(int rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + score;
    }
}
