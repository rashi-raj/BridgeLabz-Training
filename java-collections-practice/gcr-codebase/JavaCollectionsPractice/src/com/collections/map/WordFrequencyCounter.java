package com.collections.map;

/*
 * Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
 */

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        // Convert text to lowercase
        text = text.toLowerCase();

        Map<String, Integer> freqMap = new HashMap<>();
        StringBuilder word = new StringBuilder();

        // Traverse character by character
        for (char ch : text.toCharArray()) {

            // Build word if character is a letter
            if (Character.isLetter(ch)) {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    String w = word.toString();
                    freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
                    word.setLength(0); 
                }
            }
        }

        // Handle last word if string ends with a letter
        if (word.length() > 0) {
            String w = word.toString();
            freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
