package com.day6.fleetmanager;

import java.util.Scanner;

public class FleetManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MaintenanceSorter sorter = new MaintenanceSorter();

        System.out.print("Enter number of vehicles in Depot A: ");
        int n1 = sc.nextInt();
        int[] depotA = new int[n1];

        System.out.println("Enter sorted mileages for Depot A:");
        for (int i = 0; i < n1; i++) {
            depotA[i] = sc.nextInt();
        }

        System.out.print("Enter number of vehicles in Depot B: ");
        int n2 = sc.nextInt();
        int[] depotB = new int[n2];

        System.out.println("Enter sorted mileages for Depot B:");
        for (int i = 0; i < n2; i++){
            depotB[i] = sc.nextInt();
        }

        int[] masterSchedule = sorter.merge(depotA, depotB);

        System.out.println("Master Maintenance Schedule:");
        for (int m : masterSchedule) {
            System.out.print(m + " ");
        }

        sc.close();
    }
}
