package com.streamapi.forEach;
import java.util.List;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails = List.of(
            "user1@gmail.com",
            "user2@gmail.com",
            "user3@gmail.com"
        );

        // Using forEach to send email
        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Sending email to: " + email);
    }
}
