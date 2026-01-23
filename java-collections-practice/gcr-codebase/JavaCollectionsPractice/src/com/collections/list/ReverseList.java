package com.collections.list;

/*
 * Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the elements -> ");
		for(int i=0; i<n ; i++) {
			int e = sc.nextInt();
			sc.nextLine();
			list.add(e);
		}
		
		int start=0,end=n-1;
		
		while(start<end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		
		System.out.println("Reversed list -> " + list);
		sc.close();
	}
}
