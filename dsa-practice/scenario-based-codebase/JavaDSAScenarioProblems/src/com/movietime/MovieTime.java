package com.movietime;

public class MovieTime {

    static int showCount = 0;
    static Movie[] shows = new Movie[showCount];

    // Method to add a show using insertion sort
    static void addShow(String movieName, String showTime) {
        Movie movie = new Movie(movieName, showTime);

        // Resize array
        Movie[] temp = new Movie[showCount + 1];
        for (int i = 0; i < showCount; i++) {
            temp[i] = shows[i];
        }
        shows = temp;

        // Insertion sort based on show time
        int j = showCount - 1;
        while (j >= 0 && shows[j].showTime.compareTo(movie.showTime) > 0) {
            shows[j + 1] = shows[j];
            j--;
        }

        shows[j + 1] = movie;
        showCount++;

        System.out.println(showCount + ") Show added: " 
            + movieName + " at " + showTime);
    }

    // Method to display shows
    static void displayShows() {
        System.out.println("\n-------------------------------");
        System.out.println("Today's Movie Show Listings");
        System.out.println("-------------------------------");

        for (int i = 0; i < shows.length; i++) {
            System.out.println(
                "Movie: " + shows[i].movieName +
                " | Time: " + shows[i].showTime
            );
        }
    }

    public static void main(String[] args) {

        addShow("Inception", "09:30");
        addShow("Avengers: Endgame", "12:45");
        addShow("Interstellar", "11:00");
        addShow("The Dark Knight", "10:15");
        addShow("Oppenheimer", "14:30");
        addShow("Dune", "13:00");

        displayShows();
    }
}
