package com.streams;

/*
2. Buffered Streams - Efficient File Copy
Copy a large file using buffered and unbuffered streams.
Compare execution time using System.nanoTime().
*/
import java.io.*;

public class BufferedFileCopy {

    static void unbufferedCopy(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        }

        System.out.println("Unbuffered Time: " + (System.nanoTime() - start));
    }

    static void bufferedCopy(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytes;
            while ((bytes = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytes);
            }
        }

        System.out.println("Buffered Time: " + (System.nanoTime() - start));
    }

    public static void main(String[] args) throws IOException {
        File src = new File("largeFile.dat");
        unbufferedCopy(src, new File("unbuffered.dat"));
        bufferedCopy(src, new File("buffered.dat"));
    }
}
