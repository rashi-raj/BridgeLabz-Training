package com.streamslogical2;

import java.util.Arrays;
import java.util.List;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","","spring","","boot");
		list.stream().filter(i -> i.length()>=1).forEach(System.out::println);
	}
}
