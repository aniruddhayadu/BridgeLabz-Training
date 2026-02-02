package com.streamAPI.toptrendingmovies;

import java.time.LocalDate;

public class Movie {
	private String movieName;
	private double rating;
	private LocalDate date;
	
	public Movie(String movieName, double rating, LocalDate date) {
		this.movieName = movieName;
		this.rating = rating;
		this.date = date;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", rating=" + rating + ", date=" + date + "]";
	}
}
