package com.streams;

/*
8. Piped Streams - Inter-Thread Communication
One thread writes, another reads using piped streams.
*/
import java.io.*;

public class PipedStreamDemo {
    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new Thread(() -> {
            try {
                pos.write("Hello from Writer".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    pos.close();   
                } catch (IOException e) { }
            }
        }).start();

        new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    pis.close();   
                } catch (IOException e) { }
            }
        }).start();
    }
}
