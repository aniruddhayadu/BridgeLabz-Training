package com.librarymanagementsystem;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LibraryCatalog catalog = LibraryCatalog.getInstance();
		
		try {
			//here user created
			IUser student = UsersFactory.createUser("Student", "Aniruddha");
			IUser faculty = UsersFactory.createUser("Faculty", "Dr. Divyanshu");
			
			//here we add user
			catalog.addUser(student);
			catalog.addUser(faculty);
			
			student.showRoles();
			faculty.showRoles();
			
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		Book book1 = new Book.Builder()
				.title("Chitralekha")
				.author("Bhagwati charan Verma")
				.genre("Prem kahani")
				.edition(2019)
				.build();


		//now we can add book
		catalog.addBooks(book1);
	}

}
