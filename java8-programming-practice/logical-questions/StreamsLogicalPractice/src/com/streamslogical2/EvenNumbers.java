package com.streamslogical2;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,7,8,10,13);
		list.stream().filter(i -> i%2==0).forEach(System.out::println);
	}
}
