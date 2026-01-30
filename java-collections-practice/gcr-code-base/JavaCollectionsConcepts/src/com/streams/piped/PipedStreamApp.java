package com.streams.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamApp {

    public static void main(String[] args) {

        try {

            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            reader.start();
            writer.start();

        } 
        catch (IOException e) {
            System.out.println("Error while connecting piped streams");
            e.printStackTrace();
        }
    }
}
