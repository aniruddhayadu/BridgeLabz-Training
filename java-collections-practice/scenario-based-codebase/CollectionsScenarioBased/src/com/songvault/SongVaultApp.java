package com.songvault;

import java.util.*;

//Main application
public class SongVaultApp {

 public static void main(String[] args) {

     // Read songs from folder
     List<Song> songs =
             SongReader.readSongs("songs");

     System.out.println("Total songs loaded: " + songs.size());

     // Unique artists
     Set<String> artists =
             SongLibrary.getUniqueArtists(songs);
     System.out.println("Artists: " + artists);

     // Group by genre
     Map<String, List<Song>> byGenre =
             SongLibrary.groupByGenre(songs);

     System.out.println("\nSongs by Genre:");
     byGenre.forEach((g, list) ->
             System.out.println(g + " → " + list.size()));

     // Filter & sort
     System.out.println("\nQueen Songs (Sorted):");
     SongLibrary.sortByTitle(
             SongLibrary.filterByArtist(songs, "Queen"))
             .forEach(System.out::println);
 }
}
