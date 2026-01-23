package com.collections.list;

/*
 * Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		System.out.println("Enter the elements -> ");
		for(int i=0; i<n ; i++) {
			String e = sc.next();
			list.add(e);
		}
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : list) {
			map.put(word, map.getOrDefault(word, 0)+1);
		
		}
		
		System.out.println("Result -> " + map);
		sc.close();
	}
}
