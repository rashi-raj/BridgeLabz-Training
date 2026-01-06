package com.day5.personalfitnesstracker;

public class UserProfile {

    private String name;
    private int age;
    private double weight;   // sensitive health data
    private int dailyCalorieGoal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = 2000;
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, int goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = goal;
    }

    // Getter only (encapsulation)
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public String getName() {
        return name;
    }
}