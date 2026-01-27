package com.csv.question5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\rashi\\Desktop\\Java Workspace\\java-iostream-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\question1\\employees.csv";
        String searchName = "Alice";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
                }
            }
        }
    }
}
