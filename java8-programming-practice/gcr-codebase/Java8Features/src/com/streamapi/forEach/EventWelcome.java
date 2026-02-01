package com.streamapi.forEach;
import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = List.of("Ravi", "Anita", "Mohit");

        // forEach with lambda
        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
