package com.reflectionandannotation.reflection.customannotation;

public class AnnotationReflection {

	public static void main(String[] args) {

		// Get Class object
		Class<Book> cls = Book.class;

		// Check if annotation is present
		if (cls.isAnnotationPresent(Author.class)) {

			// Retrieve annotation
			Author author = cls.getAnnotation(Author.class);

			// Print annotation value
			System.out.println("Author Name: " + author.name());
		}
	}
}
