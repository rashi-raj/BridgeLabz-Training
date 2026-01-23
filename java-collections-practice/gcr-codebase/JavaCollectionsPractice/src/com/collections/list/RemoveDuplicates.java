package com.collections.list;

/*
 * Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].

 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
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
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : list) {
			set.add(num);
		}
		
		System.out.println("Result -> " + set);
		sc.close();
	}
}
