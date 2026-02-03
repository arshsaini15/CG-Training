package Streams;

import java.io.*;

public class BufferedVsUnbuffered {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) throws IOException {

        String source = "largefile.dat";
        String unbufferedDest = "unbuffered_copy.dat";
        String bufferedDest = "buffered_copy.dat";

        // Unbuffered copy
        long start = System.nanoTime();
        copyUnbuffered(source, unbufferedDest);
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) / 1_000_000 + " ms");

        // Buffered copy
        start = System.nanoTime();
        copyBuffered(source, bufferedDest);
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) / 1_000_000 + " ms");
    }

    static void copyUnbuffered(String src, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void copyBuffered(String src, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}
