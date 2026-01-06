package com.day5.personalfitnesstracker;

public abstract class WorkOut implements ITrackable {

    protected String type;
    protected int duration;           // minutes
    protected double caloriesBurned;

    private String workoutLog = "Workout Started";

    public WorkOut(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories(double weight);

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started...");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout ended.");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}