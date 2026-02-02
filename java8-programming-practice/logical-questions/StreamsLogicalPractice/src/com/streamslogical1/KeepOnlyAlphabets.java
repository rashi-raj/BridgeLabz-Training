package com.streamslogical1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KeepOnlyAlphabets {
	public static void main(String[] args) {
		String s = "java8stream2025";
		String result = Arrays.stream(s.split(""))
				              .filter(i -> i.matches("[a-zA-Z]"))
				              .collect(Collectors.joining());
		System.out.println(result);
	}
}
