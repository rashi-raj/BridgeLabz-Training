package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "spring", "java", "api");

        Map<String, Long> map =
                list.stream()
                    .collect(Collectors.groupingBy(
                            w -> w,
                            LinkedHashMap::new,
                            Collectors.counting()
                    ));

        System.out.println(map);
    }
}
