package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List <Book> Books;
	List<User>Users;
	
	public Library() {
		Books = new ArrayList<>();
		Users = new ArrayList<>();
	} 
	public void registerBook(Book book) {
		Books.add(book);
		System.out.println(book.getTitle()+" book added Succesfully to Library");
	}
	
	public void isuueBook(Book book,User user) {
		Books.remove(book);
		System.out.println(	book.getTitle()+" book has isuued to "+user.getName());
		
	}
	
	public void receiveBook(Book book,User user) {
		Books.add(book);
		System.out.println(book.getTitle()+" book has received from "+user.getName());
		
	}
	
	public void removeBooks(Book book) {
		Books.remove(book);
		System.out.println(book.getTitle()+" has removed from the library");
	}

}
