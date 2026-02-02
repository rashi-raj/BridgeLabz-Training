package com.streamslogical1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCharCount {
	public static void main(String[] args) {
		String s = "banana";
		Map<Character, Long> result = s.chars().mapToObj(c -> (char)c)
		         .collect(Collectors.groupingBy(c ->  c, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}
}
