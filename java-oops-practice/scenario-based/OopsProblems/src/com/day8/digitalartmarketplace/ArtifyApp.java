package com.day8.digitalartmarketplace;

import java.util.Scanner;

public class ArtifyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Artify App");
        System.out.println("Are you a Buyer or Artist?");
        String role = sc.next();
        
        Artwork digitalArt = new DigitalArt(
                "NFT Sunset", "Amit", "preview.jpg", 3000);
        Artwork printArt = new PrintArt(
                "Nature Canvas", "Neha", 2000);

        if (role.equalsIgnoreCase("Buyer")) {

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter wallet balance: ");
            double balance = sc.nextDouble();

            BuyerUser buyer = new BuyerUser(name, balance);

            while (true) {
                System.out.println("\nChoose option:\n1. View Art Gallery\n2. Buy Digital Art\n3. Buy Print Art\n4. Exit");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1 -> {
                        System.out.println("\nWelcome to Artify App");
                        digitalArt.displayArtwork();
                        System.out.println();
                        printArt.displayArtwork();
                    }

                    case 2 -> {
                        boolean eligible = buyer.hasSufficientBalance(digitalArt.getPrice());

                        ((IPurchasable) digitalArt).purchase(eligible);

                        if (eligible) {
                            buyer.deductBalance(digitalArt.getPrice());
                            ((IPurchasable) digitalArt).license(); 
                        }
                        buyer.displayBalance();
                    }

                    case 3 -> {
                        boolean eligible = buyer.hasSufficientBalance(printArt.getPrice());

                        ((IPurchasable) printArt).purchase(eligible);

                        if (eligible) {
                            buyer.deductBalance(printArt.getPrice());
                            ((IPurchasable) printArt).license(); 
                        }
                        buyer.displayBalance();
                    }

                    case 4 -> {
                        System.out.println("Thank you for using Artify!");
                        System.exit(0);
                    }

                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        
        else if (role.equalsIgnoreCase("Artist")) {

            System.out.print("Enter artist name: ");
            String name = sc.next();

            Artist artist = new Artist(name);

            while (true) {
                System.out.println("\nChoose option:\n1. Upload Artwork\n2. Exit");

                int choice = sc.nextInt();

                if (choice == 1) {
                    artist.uploadArtwork();
                } else if (choice == 2) {
                    System.out.println("Goodbye Artist!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option!");
                }
            }
        }

        else {
            System.out.println("Invalid user role!");
        }
        
        sc.close();
    }
}
