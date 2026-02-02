package com.streamslogical1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String s = "stress";
		Character result = s.chars().mapToObj(c -> (char)c)
		         .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
		         .entrySet()
		         .stream()
		         .filter(i -> i.getValue()==1)
		         .map(Map.Entry::getKey)
		         .findFirst()
		         .orElse(null);
		System.out.println(result);
	}
}
