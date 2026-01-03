package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class Main {

    public static void main(String[] args) {

        TicketCircularList tickets = new TicketCircularList();

        tickets.addTicket(101, "Ravi", "Inception", "A1", "10:00 AM");
        tickets.addTicket(102, "Neha", "Avatar", "B5", "11:30 AM");
        tickets.addTicket(103, "Amit", "Inception", "C3", "01:00 PM");

        System.out.println("All Booked Tickets:");
        tickets.displayTickets();

        System.out.println("\nSearch by Movie Name:");
        tickets.searchTicket("Inception");

        System.out.println("\nTotal Tickets Booked: " + tickets.countTickets());

        System.out.println("\nRemoving Ticket ID 102");
        tickets.removeTicket(102);

        System.out.println("\nUpdated Ticket List:");
        tickets.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + tickets.countTickets());
    }
}

