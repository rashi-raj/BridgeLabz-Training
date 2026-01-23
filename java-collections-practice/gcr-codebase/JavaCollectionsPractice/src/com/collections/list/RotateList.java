package com.collections.list;

/*
 * Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateList {
	public static void reverse(List<Integer> list, int start, int end) {
		while(start<end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end,temp);
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the elements -> ");
		for(int i=0; i<n ; i++) {
			int e = sc.nextInt();
			list.add(e);
		}
		System.out.println("Enter the rotation: ");
		int k = sc.nextInt();
		/* Left rotate ->
		 * Step-1 - Rotate fist k elements
		 * Step-2 - Rotate rest (n-k) elements
		 * Step-3 - Rotate the entire array
		 
		 * Right rotate ->
		 * Step-1 - Rotate the entire array
		 * Step-2 - Rotate fist k elements
		 * Step-3 - Rotate rest (n-k) elements
		 */
		reverse(list, 0 , k-1);
		reverse(list, k , n-1);
		reverse(list, 0, n-1);
		
		System.out.println("Result -> " + list);
		sc.close();
		
	}
}
