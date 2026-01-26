package com.regex;

/*
 * Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)

 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {

    public static void main(String[] args) {

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter username: ");
            String input = sc.next();

            Matcher matcher = pattern.matcher(input);

            if (matcher.matches())
                System.out.println("Valid username");
            else
                System.out.println("Invalid username");

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));

        sc.close();
    }
}
