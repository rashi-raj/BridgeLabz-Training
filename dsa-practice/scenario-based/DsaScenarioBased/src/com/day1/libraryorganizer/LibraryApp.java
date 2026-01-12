package com.day1.libraryorganizer;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.next();

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    shelf.addBook(genre, new Book(id, name, author));
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String g = sc.next();

                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();

                    shelf.borrowBook(g, bid);
                    break;

                case 3:
                    System.out.print("Enter Genre: ");
                    String rg = sc.next();

                    System.out.print("Enter Book ID: ");
                    int rid = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String rname = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String rauthor = sc.nextLine();

                    shelf.returnBook(rg, new Book(rid, rname, rauthor));
                    break;

                case 4:
                    shelf.displayBooks();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
