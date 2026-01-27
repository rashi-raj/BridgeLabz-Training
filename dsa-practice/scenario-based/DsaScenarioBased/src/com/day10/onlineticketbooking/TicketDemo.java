package com.day10.onlineticketbooking;

public class TicketDemo {
	public static void main(String[] args) {
        EventAVL events = new EventAVL();
        events.insert(new Event("Concert", 15));
        events.insert(new Event("Movie", 10));
        events.insert(new Event("Seminar", 20));

        System.out.println("Events in order:");
        events.displayInOrder();

        System.out.println("\nCancelling Movie:");
        events.delete(10);
        events.displayInOrder();
    }
}
