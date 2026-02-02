package com.streamslogical1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountEachCharExceptSpace {
	public static void main(String[] args) {
		String s = "java stream";
		String result = Arrays.stream(s.split(""))
				              .filter(i -> !i.equals(" "))
				              .collect(Collectors.joining());
		System.out.println(result);
	}
}
