package com.day5.virtualpetcareapp;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated internal states
    private int hunger;  
    private int energy;   
    private int mood;    

    // Random default constructor
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        Random r = new Random();
        this.age = r.nextInt(10) + 1;
        this.hunger = r.nextInt(50) + 25;
        this.energy = r.nextInt(50) + 25;
        this.mood = r.nextInt(50) + 25;
    }

    // User-specified constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        this.mood = 50;
    }

    // Interaction methods 
    @Override
    public void feed() {
        hunger -= 20;
        mood += 10;
        if (hunger < 0) hunger = 0;
        if (mood > 100) mood = 100;
        System.out.println(name + " is fed.");
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        mood += 20;
        limitValues();
        System.out.println(name + " enjoyed playing!");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        limitValues();
        System.out.println(name + " is sleeping peacefully.");
    }

    // Helper method
    protected void limitValues() {
        if (energy > 100) energy = 100;
        if (hunger > 100) hunger = 100;
        if (energy < 0) energy = 0;
        if (mood < 0) mood = 0;
    }

    public void showStatus() {
        System.out.println("\n--- PET STATUS ---");
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    // Polymorphic method
    public abstract void makeSound();
}
