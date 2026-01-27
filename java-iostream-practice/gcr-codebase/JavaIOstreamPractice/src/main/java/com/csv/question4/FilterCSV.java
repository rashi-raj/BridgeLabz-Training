package com.csv.question4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\rashi\\Desktop\\Java Workspace\\java-iostream-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\question1\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]);
                if (marks > 80) {
                    System.out.println(line);
                }
            }
        }
    }
}
