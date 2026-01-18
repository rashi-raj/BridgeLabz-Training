package com.day5.sensordataordering;

import java.util.Scanner;

public class CropMonitor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SensorSorter sorter = new SensorSorter();

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        int[] timestamps = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter timestamp " + (i + 1) + ": ");
            timestamps[i] = sc.nextInt();
        }

        sorter.quickSort(timestamps, 0, n - 1);

        System.out.println("Sorted sensor timestamps:");
        for (int t : timestamps) {
            System.out.print(t + " ");
        }

        sc.close();
    }
}
