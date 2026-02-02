package com.streamslogical2;

import java.util.Arrays;
import java.util.List;

public class StringsStartWithA {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","ant","car");
		list.stream().filter(i -> i.startsWith("a")).forEach(System.out::println);
	}
}
