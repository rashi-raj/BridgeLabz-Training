package com.streamslogical2;

import java.util.Arrays;

public class CountWords {
	public static void main(String[] args) {
		String s = "Java is very powerful";
		Long result = Arrays.stream(s.split(" ")).count();
		System.out.println(result);
	}
}
