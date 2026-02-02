package com.streamslogical2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Boot");

        String result =
                list.stream()
                    .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
