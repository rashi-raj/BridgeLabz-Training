package com.regex;
/*
 * Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.

*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicense {
	public static void main(String[] args) {
		String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter License Plate number: ");
            String input = sc.next();

            Matcher matcher = pattern.matcher(input);

            if (matcher.matches())
                System.out.println("Valid License Plate number");
            else
                System.out.println("Invalid License Plate number");

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));

        sc.close();
	}
}
