package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexToElementMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");

        Map<Integer, String> map =
                IntStream.range(0, list.size())
                         .boxed()
                         .collect(Collectors.toMap(
                                 i -> i,
                                 list::get
                         ));

        System.out.println(map);
    }
}
