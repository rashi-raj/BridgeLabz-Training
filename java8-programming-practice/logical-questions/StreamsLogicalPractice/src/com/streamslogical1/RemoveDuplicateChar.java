package com.streamslogical1;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s = "banana";
		s.chars().mapToObj(c -> (char)c)
		         .collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::print);
		/*
	     s.chars()
 		  .mapToObj(c -> (char) c)
 		  .distinct()
 		  .forEach(System.out::println);
		 */
	}
}
