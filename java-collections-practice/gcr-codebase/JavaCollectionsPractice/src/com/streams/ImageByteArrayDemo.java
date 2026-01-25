package com.streams;

/*
5. ByteArray Stream - Convert Image to ByteArray
Read image into byte array and write it back.
*/
import java.io.*;

public class ImageByteArrayDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int data;
        while ((data = fis.read()) != -1) {
            baos.write(data);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("output.jpg");

        while ((data = bais.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
