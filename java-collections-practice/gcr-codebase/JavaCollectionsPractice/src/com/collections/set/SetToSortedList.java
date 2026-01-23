package com.collections.set;
/*
 * Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetToSortedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i=0 ; i<n ; i++) {
			int temp = sc.nextInt();
			set.add(temp);
		}
		
		List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
	}
}
