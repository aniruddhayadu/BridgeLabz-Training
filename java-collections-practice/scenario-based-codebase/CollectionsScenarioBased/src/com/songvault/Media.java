package com.songvault;

import java.util.*;
import java.util.stream.*;

// Manages song collections
public class SongLibrary {

    // Group songs by genre
    public static Map<String, List<Song>> groupByGenre(List<Song> songs) {
        return songs.stream()
                .collect(Collectors.groupingBy(Song::getGenre));
    }

    // Get unique artists
    public static Set<String> getUniqueArtists(List<Song> songs) {
        return songs.stream()
                .map(Song::getArtist)
                .collect(Collectors.toSet());
    }

    // Filter songs by artist
    public static List<Song> filterByArtist(
            List<Song> songs, String artist) {

        return songs.stream()
                .filter(s -> s.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    // Sort songs by title
    public static List<Song> sortByTitle(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList());
    }
}

