package com.day10.musicapp;

import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {

        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Music Library =====");
            System.out.println("1. Insert New Track");
            System.out.println("2. Search Track by ID");
            System.out.println("3. Show Playlist Alphabetically");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    bst.root = bst.insert(bst.root, id, title);
                    System.out.println("Track added.");
                    break;

                case 2:
                    System.out.print("Enter Track ID to search: ");
                    int searchId = sc.nextInt();

                    Song s = bst.searchByTrackId(bst.root, searchId);
                    if (s != null)
                        System.out.println("Found → " + s.title);
                    else
                        System.out.println("Track not found.");
                    break;

                case 3:
                    System.out.println("\nPlaylist (Alphabetical):");
                    bst.display();
                    break;

                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
