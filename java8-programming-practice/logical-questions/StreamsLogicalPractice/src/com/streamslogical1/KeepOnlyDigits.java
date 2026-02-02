package com.streamslogical1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KeepOnlyDigits {
	public static void main(String[] args) {
		String s = "orderId=AB123XZ9";
		String result = Arrays.stream(s.split(""))
				              .filter(i -> i.matches("[0-9]"))
				              .collect(Collectors.joining());
		System.out.println(result);
	}
}
