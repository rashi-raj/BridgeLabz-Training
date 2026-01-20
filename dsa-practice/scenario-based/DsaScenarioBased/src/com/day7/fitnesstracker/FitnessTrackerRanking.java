package com.day7.fitnesstracker;

/*
 FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting

 */

import java.util.Scanner;

public class FitnessTrackerRanking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Fitness tracker");
		System.out.println("Enter number of users : ");
		int n = sc.nextInt();
		int steps[] = new int[n];
		System.out.println("Enter steps for each user ->");
		for(int i=0 ; i<n ; i++) {
			System.out.print("User " + (i+1) + " : " );
			steps[i] = sc.nextInt();
		}
		
		UserStepsSorting us = new UserStepsSorting();
		us.sort(steps);
		us.displayList(steps);
		
		sc.close();
 	}
}
