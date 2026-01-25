package com.streams;

/*
3. Read User Input from Console
Read name, age, and favorite language using BufferedReader
and save into a file using FileWriter.
*/
import java.io.*;

public class ConsoleInputToFile {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userInfo.txt")) {

            System.out.print("Enter Name: ");
            fw.write("Name: " + br.readLine() + "\n");

            System.out.print("Enter Age: ");
            fw.write("Age: " + br.readLine() + "\n");

            System.out.print("Favorite Language: ");
            fw.write("Language: " + br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
