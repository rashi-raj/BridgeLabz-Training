package com.streamslogical2;

import java.util.Arrays;

public class CountVowels {
	public static void main(String[] args) {
		String s = "programming";
		Long result = Arrays.stream(s.split("")).filter(i -> i.matches("[aeiouAEIOU]")).count();
		System.out.println(result);
	}
}
