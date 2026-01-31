package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;

// Reads song files from directory
public class SongReader {

    // Regex patterns
    private static final Pattern TITLE =
            Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST =
            Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION =
            Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE =
            Pattern.compile("Genre:\\s*(.*)");

    // Reads all song files
    public static List<Song> readSongs(String folderPath) {

        List<Song> songs = new ArrayList<>();
        File folder = new File(folderPath);

        File[] files = folder.listFiles((d, name) -> name.endsWith(".txt"));
        if (files == null) return songs;

        for (File file : files) {
            try (BufferedReader br =
                         new BufferedReader(new FileReader(file))) {

                String title = "", artist = "", duration = "", genre = "";
                String line;

                while ((line = br.readLine()) != null) {
                    if (TITLE.matcher(line).matches())
                        title = TITLE.matcher(line).replaceAll("$1");

                    else if (ARTIST.matcher(line).matches())
                        artist = ARTIST.matcher(line).replaceAll("$1");

                    else if (DURATION.matcher(line).matches())
                        duration = DURATION.matcher(line).replaceAll("$1");

                    else if (GENRE.matcher(line).matches())
                        genre = GENRE.matcher(line).replaceAll("$1");
                }

                // Create Song object
                songs.add(new Song(title, artist, duration, genre));

            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        return songs;
    }
}
