package com.streamslogical2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "api");

        List<String> result =
                list.stream()
                    .map(s -> new StringBuilder(s).reverse().toString())
                    .collect(Collectors.toList());

        System.out.println(result);
	}
}
