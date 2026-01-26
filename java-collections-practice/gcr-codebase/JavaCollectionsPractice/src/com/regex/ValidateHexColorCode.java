package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
	public static void main(String[] args) {
		String regex = "[#][a-fA-F0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter Hex color code: ");
            String input = sc.next();

            Matcher matcher = pattern.matcher(input);

            if (matcher.matches())
                System.out.println("Valid color code");
            else
                System.out.println("Invalid color code");

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));

        sc.close();
	}
}
