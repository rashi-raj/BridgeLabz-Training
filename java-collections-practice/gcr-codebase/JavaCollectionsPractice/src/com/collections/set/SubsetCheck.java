package com.collections.set;
/*
 * Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubsetCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in set1: ");
		int n1 = sc.nextInt();
		Set<Integer> set1 = new HashSet<>();
		for(int i=0 ; i<n1 ; i++) {
			int temp = sc.nextInt();
			set1.add(temp);
		}
		
		System.out.println("Enter the number of elements in set2: ");
		int n2 = sc.nextInt();
		Set<Integer> set2 = new HashSet<>();
		for(int i=0 ; i<n2 ; i++) {
			int temp = sc.nextInt();
			set2.add(temp);
		}
		
		boolean isSubset = set2.containsAll(set1);

        System.out.println(isSubset);
	}
}
