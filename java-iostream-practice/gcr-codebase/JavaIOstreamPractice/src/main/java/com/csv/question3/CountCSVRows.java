package com.csv.question3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\rashi\\Desktop\\Java Workspace\\java-iostream-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\question1\\students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            while (br.readLine() != null) {
                count++;
            }
        }
        System.out.println("Number of records: " + count);
    }
}
