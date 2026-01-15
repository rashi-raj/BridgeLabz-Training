package com.day4.eventmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();
        TicketQuickSort sorter = new TicketQuickSort();

        while (true) {
            System.out.println("\n===== Event Ticket Manager =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Sort Tickets by Price");
            System.out.println("3. Show Cheapest Tickets");
            System.out.println("4. Show Most Expensive Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter event name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter ticket price: ");
                    double price = sc.nextDouble();

                    tickets.add(new Ticket(name, price));
                    System.out.println("Ticket added!");
                    break;

                case 2:
                    sorter.quickSort(tickets, 0, tickets.size() - 1);
                    System.out.println("Tickets sorted by price.");
                    break;

                case 3:
                    sorter.quickSort(tickets, 0, tickets.size() - 1);
                    System.out.println("Cheapest Tickets:");
                    for (int i = 0; i < Math.min(5, tickets.size()); i++) {
                        System.out.println(tickets.get(i));
                    }
                    break;

                case 4:
                    sorter.quickSort(tickets, 0, tickets.size() - 1);
                    System.out.println("Most Expensive Tickets:");
                    for (int i = tickets.size() - 1; i >= Math.max(0, tickets.size() - 5); i--) {
                        System.out.println(tickets.get(i));
                    }
                    break;

                case 5:
                    System.out.println("Exiting Event Manager.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
