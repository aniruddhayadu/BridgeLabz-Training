package com.collectors.librarybookstatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BookStaticsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list = List.of(
				new Book("Gunaho ka devta","Adhura Prem",183),
				new Book("Godan","Novel",254),
				new Book("Chitralekha","Prem Kahani",230),
				new Book("Java Programming","Programming",1165)
			);
	
	
		System.out.println(
			list.stream()
				.collect(Collectors.groupingBy(Book::getGenere, Collectors.summarizingInt(Book::getBookPage)))
			);
	}

}
