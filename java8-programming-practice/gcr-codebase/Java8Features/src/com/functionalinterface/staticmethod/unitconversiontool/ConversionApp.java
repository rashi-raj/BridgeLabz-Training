package com.functionalinterface.staticmethod.unitconversiontool;
import java.util.Scanner;

public class ConversionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        System.out.print("Enter weight in kg: ");
        double kg = sc.nextDouble();

        System.out.println("Miles: " + UnitConverter.kmToMiles(km));
        System.out.println("Pounds: " + UnitConverter.kgToPounds(kg));
        
        sc.close();
    }
}
