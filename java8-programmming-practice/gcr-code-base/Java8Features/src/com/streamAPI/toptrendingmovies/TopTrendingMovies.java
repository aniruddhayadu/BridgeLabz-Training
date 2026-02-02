package com.streamAPI.toptrendingmovies;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TopTrendingMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> movieList = new ArrayList<>();
		
		movieList.add(new Movie("RRR",9.4,LocalDate.of(2023, 11, 22)));
		movieList.add(new Movie("PK",8.2,LocalDate.of(2017, 7, 29)));
		movieList.add(new Movie("Pushpa",7.3,LocalDate.of(2021, 3, 25)));
		movieList.add(new Movie("98",9.9,LocalDate.of(2014, 1, 12)));
		movieList.add(new Movie("The real power",6.6,LocalDate.of(2011, 3, 17)));
		movieList.add(new Movie("Kali",3.4,LocalDate.of(2026, 2, 14)));
		
		
		movieList.stream()
					.filter(Movie-> Movie.getDate().isAfter(LocalDate.of(2020, 01, 01)))
					.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getDate, Comparator.reverseOrder()))
					.limit(5)
					.forEach(System.out::println);
	}

}
