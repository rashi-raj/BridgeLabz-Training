package com.day5.personalfitnesstracker;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Do you want to set custom calorie goal? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        UserProfile user;
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter daily calorie goal: ");
            int goal = sc.nextInt();
            user = new UserProfile(name, age, weight, goal);
        } else {
            user = new UserProfile(name, age, weight);
        }

        // Workout selection
        System.out.println("Choose workout:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        int workoutChoice = sc.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        int duration = sc.nextInt();

        WorkOut workout;

        if (workoutChoice == 1)
            workout = new CardioWorkout(duration);
        else
            workout = new StrengthWorkout(duration);

        // Tracking workout
        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        // Operators for progress calculation
        double burned = workout.getCaloriesBurned();
        int remaining = (int) (user.getDailyCalorieGoal() - burned);

        System.out.println("\n--- DAILY FITNESS REPORT ---");
        System.out.println("User: " + user.getName());
        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Calories: " + remaining);

        sc.close();
    }
}