package com.exceptions;

/*
1. Checked Exception
Read file name dynamically.
*/
import java.io.*;
import java.util.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        sc.close();
    }
}
