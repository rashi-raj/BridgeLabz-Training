package com.streamslogical2;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToUpperCase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","spring","boot");
		list.stream().map(i -> i.toUpperCase()).forEach(System.out::println);
	}
}
