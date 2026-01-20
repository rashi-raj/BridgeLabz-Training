package com.day7.fitnesstracker;

public class UserStepsSorting {
	public void sort(int steps[]) {
		for(int i=0 ; i<steps.length-1 ; i++) {
			for(int j=0 ; j<steps.length-1-i ; j++) {
				if(steps[j] > steps[j+1]) {
					int temp = steps[j];
					steps[j] = steps[j+1];
					steps[j+1] = temp;
				}
			}
		}
	}
	
	public void displayList(int steps[]) {
		System.out.println("Sorted list -> ");
		for(int i=0 ; i<steps.length ; i++) {
			System.out.println( "Rank " + (i+1) + ": " + steps[i]);
		}
	}
}
