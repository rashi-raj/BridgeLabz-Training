package com.streamslogical1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveRepeatingChar {
	public static void main(String[] args) {
		String s = "aabbccdde";
		String result = s.chars()
		 .mapToObj(c -> (char)c)
		 .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(c -> c.getValue()==1)
		 .map(Map.Entry::getKey)
		 .map(String::valueOf)
		 .collect(Collectors.joining());
		
		System.out.println(result);
	}
}
