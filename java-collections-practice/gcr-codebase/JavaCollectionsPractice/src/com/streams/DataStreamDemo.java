package com.streams;

/*
7. Data Streams - Store and Retrieve Primitive Data
Write and read student details using Data streams.
*/
import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Rashi");
            dos.writeDouble(8.8);
        }

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
    }
}
