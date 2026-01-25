package com.streams.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Program to compare buffered and unbuffered stream performance
public class StreamPerformanceTest {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile = "scr\\com\\streams\\buffered\\source.txt";
        String normalDest = "scr\\com\\streams\\buffered\\normalCopy.txt";
        String bufferedDest = "scr\\com\\streams\\buffered\\bufferedCopy.txt";

        copyUsingNormalStreams(sourceFile, normalDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    // Copy using FileInputStream and FileOutputStream
    private static void copyUsingNormalStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in normal stream copy");
        }

        long endTime = System.nanoTime();
        System.out.println("Normal Streams Time: " + (endTime - startTime) + " ns");
    }

    // Copy using BufferedInputStream and BufferedOutputStream
    private static void copyUsingBufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in buffered stream copy");
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) + " ns");
    }
}