package com.collections.set;
/*
 * Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.

 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
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
		
		// Union
	    Set<Integer> union = new HashSet<>(set1);
	    union.addAll(set2);

	    // Intersection
	    Set<Integer> intersection = new HashSet<>(set1);
	    intersection.retainAll(set2);
	    
	    union.removeAll(intersection);

	    System.out.println("Symmetric Difference: " + union);
	}
}
