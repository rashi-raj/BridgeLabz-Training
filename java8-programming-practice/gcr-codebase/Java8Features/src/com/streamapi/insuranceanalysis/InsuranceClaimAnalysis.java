package com.streamapi.insuranceanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Claim> claims = new ArrayList<>();

        // Taking number of claims
        System.out.println("Enter number of claims: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Taking claim details dynamically
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Claim " + (i + 1));

            System.out.print("Enter claim type (Health/Vehicle/Life): ");
            String type = sc.nextLine();

            System.out.print("Enter claim amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            // Add claim to list
            claims.add(new Claim(type, amount));
        }

        Map<String, Double> avgClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              Claim::getClaimType,
                              Collectors.averagingDouble(Claim::getClaimAmount)
                      ));

        // Display result
        System.out.println("\nAverage Claim Amount for each Claim Type:");
        avgClaimAmount.forEach((type, avg) ->
                System.out.println(type + " → " + avg)
        );

        sc.close();
    }
}
