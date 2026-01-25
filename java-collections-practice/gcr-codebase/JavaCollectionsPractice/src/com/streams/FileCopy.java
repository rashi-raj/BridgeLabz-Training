package com.streams;

/*
1. File Handling - Read and Write a Text File
Read contents of a source text file and write into a destination file.
Use FileInputStream and FileOutputStream.
Handle IOException.
*/
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        File src = new File("source.txt");
        File dest = new File("destination.txt");

        if (!src.exists()) {
            System.out.println("Source file does not exist");
            return;
        }

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
