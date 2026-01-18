package com.day5.cinemahouse;

import java.util.Scanner;

public class CinemaHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShowTimeSorter sorter = new ShowTimeSorter();

        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter show time (in minutes) " + (i + 1) + ": ");
            showTimes[i] = sc.nextInt();
        }

        sorter.bubbleSort(showTimes);

        System.out.println("Sorted showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }

        sc.close();
    }
}
