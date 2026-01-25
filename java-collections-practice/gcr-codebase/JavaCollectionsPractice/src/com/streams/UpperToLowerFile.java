package com.streams;

/*
6. Filter Streams - Convert Uppercase to Lowercase
Read a text file and write lowercase content to another file.
*/
import java.io.*;

public class UpperToLowerFile {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
