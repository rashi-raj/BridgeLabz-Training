package com.exceptions;

/*
6. throw vs throws
Dynamic interest calculation.
*/
import java.util.*;

public class ThrowVsThrowsDemo {

    static double calculateInterest(double amt, double rate, int years) {
        if (amt < 0 || rate < 0)
            throw new IllegalArgumentException();
        return (amt * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double amt = sc.nextDouble();
            double rate = sc.nextDouble();
            int years = sc.nextInt();

            System.out.println("Interest: " + calculateInterest(amt, rate, years));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
        sc.close();
    }
}
