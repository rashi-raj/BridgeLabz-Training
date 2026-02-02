package com.streamslogical1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveNonAlphaNumericChar {
	public static void main(String[] args) {
		String s = "ja@va#8!!";
		String result = Arrays.stream(s.split(""))
				              .filter(i -> i.matches("[a-zA-Z0-9]"))
				              .collect(Collectors.joining());
		System.out.println(result);
	}
}
