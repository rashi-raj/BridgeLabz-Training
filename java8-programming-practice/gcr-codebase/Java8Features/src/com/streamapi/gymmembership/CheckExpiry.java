package com.streamapi.gymmembership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckExpiry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Member> members = new ArrayList<>();

        System.out.println("Enter number of gym members: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Taking member details 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Member " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter expiry date (yyyy-mm-dd): ");
            String dateInput = sc.nextLine();

            // Convert String to LocalDate
            LocalDate expiryDate = LocalDate.parse(dateInput);

            members.add(new Member(name, expiryDate));
        }

        // Today's date
        LocalDate today = LocalDate.now();

        // Date after 30 days
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nMembers whose membership expires within next 30 days:");

        members.stream()
               .filter(m -> !m.getExpiryDate().isBefore(today) &&
                            !m.getExpiryDate().isAfter(next30Days))
               .forEach(System.out::println);

        sc.close();
    }
}
