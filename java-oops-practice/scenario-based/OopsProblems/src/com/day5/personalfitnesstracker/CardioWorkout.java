package com.day5.personalfitnesstracker;

public class CardioWorkout extends WorkOut {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.08; 
    }
}