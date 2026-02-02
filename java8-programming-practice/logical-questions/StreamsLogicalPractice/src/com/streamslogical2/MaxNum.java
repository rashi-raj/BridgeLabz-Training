package com.streamslogical2;

import java.util.Arrays;
import java.util.List;

public class MaxNum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 25, 3, 99, 45);

        int max =
                list.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElseThrow();

        System.out.println(max);
	}
}
