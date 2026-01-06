package com.day5.eventmanagementplatform;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer input
        System.out.print("Enter organizer name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        User organizer = new User(name, email, phone);

        // Event details
        System.out.print("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter base venue cost: ");
        double baseCost = sc.nextDouble();

        System.out.print("Include catering/decoration? (yes/no): ");
        sc.nextLine();
        String serviceChoice = sc.nextLine();

        double serviceCost = 0, discount = 0;

        if (serviceChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter service cost: ");
            serviceCost = sc.nextDouble();

            System.out.print("Enter discount: ");
            discount = sc.nextDouble();
        }

        System.out.println("Select event type:");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int type = sc.nextInt();

        Event event;

        if (type == 1) {
            event = new BirthdayEvent(eventName, location, date, attendees,
                    organizer, baseCost, serviceCost, discount);
        } else {
            event = new ConferenceEvent(eventName, location, date, attendees,
                    organizer, baseCost, serviceCost, discount);
        }

        // Scheduling
        event.schedule();

        System.out.println("\nEvent ID (read-only): " + event.getEventId());
        System.out.println("Total Cost: ₹" + event.calculateTotalCost());

        sc.close();
    }
}
