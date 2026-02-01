package com.functionalinterface.staticmethod.passwordstrengthvalidator;
import java.util.Scanner;

public class PasswordValidatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password ✅");
        } else {
            System.out.println("Weak Password ❌");
        }
        sc.close();
    }
}
