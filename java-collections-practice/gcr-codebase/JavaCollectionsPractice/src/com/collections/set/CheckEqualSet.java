package com.collections.set;
/*
 * Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.

 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckEqualSet {
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
		
		if (set1.equals(set2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
	}
}
