package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {

    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.8);

        System.out.println("All Movies (Forward):");
        list.displayForward();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");

        list.updateRating("Avatar", 8.0);
        list.removeByTitle("Inception");

        System.out.println("\nAfter Updates (Forward):");
        list.displayForward();

        System.out.println("\nDisplay in Reverse:");
        list.displayReverse();
    }
}

