package com.functionalinterface.functionalinterface;
import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        String message = "Hospital appointment reminder";
        int limit = 20;

        // Function to get string length
        Function<String, Integer> getLength =
                text -> text.length();

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
