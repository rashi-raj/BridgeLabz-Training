package com.day5.virtualpetcareapp;

import java.util.Scanner;

public class PetCareApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.println("Choose pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        int choice = sc.nextInt();

        System.out.print("Do you want to enter age? (yes/no): ");
        sc.nextLine();
        String ageChoice = sc.nextLine();

        Pet pet;

        if (choice == 1) {
            pet = ageChoice.equalsIgnoreCase("yes")
                    ? new Dog(name, getAge(sc))
                    : new Dog(name);
        } else if (choice == 2) {
            pet = ageChoice.equalsIgnoreCase("yes")
                    ? new Cat(name, getAge(sc))
                    : new Cat(name);
        } else {
            pet = ageChoice.equalsIgnoreCase("yes")
                    ? new Bird(name, getAge(sc))
                    : new Bird(name);
        }

        int action;
        do {
            System.out.println("\nChoose Action:");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. Show Status");
            System.out.println("0. Exit");

            action = sc.nextInt();

            switch (action) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.sleep();
                case 4 -> pet.makeSound();
                case 5 -> pet.showStatus();
                case 0 -> System.out.println("Thanks for using PetPal!");
                default -> System.out.println("Invalid choice!");
            }

        } while (action != 0);

        sc.close();
    }

    private static int getAge(Scanner sc) {
        System.out.print("Enter pet age: ");
        return sc.nextInt();
    }
}
