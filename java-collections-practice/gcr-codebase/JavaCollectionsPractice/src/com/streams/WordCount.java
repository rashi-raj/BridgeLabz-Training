package com.streams;

/*
10. Count Words in a File
Count word frequency and display top 5 frequent words.
*/
import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split("\\W+")) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
