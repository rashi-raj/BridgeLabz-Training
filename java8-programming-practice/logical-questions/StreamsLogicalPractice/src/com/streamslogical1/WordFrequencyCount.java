package com.streamslogical1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCount {
	public static void main(String[] args) {
		String s = "java is java and java is fast";
		Map<String, Long> result = Arrays.stream(s.split("\\s+"))
		      .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}
}
