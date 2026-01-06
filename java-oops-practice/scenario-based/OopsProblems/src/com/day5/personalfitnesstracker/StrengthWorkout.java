package com.day5.personalfitnesstracker;

public class StrengthWorkout extends WorkOut {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.06; // strength formula
    }
}