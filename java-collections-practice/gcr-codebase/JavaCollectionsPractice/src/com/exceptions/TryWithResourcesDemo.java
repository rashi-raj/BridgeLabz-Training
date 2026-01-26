package com.exceptions;

/*
5. Try-with-resources
Dynamic file reading.
*/
import java.io.*;
import java.util.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        sc.close();
    }
}
