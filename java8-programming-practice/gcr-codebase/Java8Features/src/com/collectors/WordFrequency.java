package com.collectors;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph:");
        String text = sc.nextLine();

        Map<String, Long> wordCount =
                Arrays.stream(text.toLowerCase().split("\\s+"))
                      .collect(Collectors.toMap(
                              word -> word,
                              _ -> 1L,
                              Long::sum // merge function
                      ));

        System.out.println(wordCount);
        sc.close();
    }
}
