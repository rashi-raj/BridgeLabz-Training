package com.streamslogical2;
import java.util.*;

public class LongestString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java","microservices","api");

        String result =
                list.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

        System.out.println(result);
    }
}
