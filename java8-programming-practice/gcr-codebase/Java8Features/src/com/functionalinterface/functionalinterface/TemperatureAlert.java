package com.functionalinterface.functionalinterface;
import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double currentTemp = 39.5;
        double threshold = 37.0;

        // Predicate to check temperature
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("Temperature Alert: High Temperature!");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
