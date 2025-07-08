package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
	private int userId;
	private String name;
	 List<Book> borrowedBooks;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public User(int userId,String name) {
		this.userId = userId;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public abstract void borrowBooks(Book book,String name);
	public abstract void returnBooks(Book book,String name);
	public abstract int getLimit();

	
	
	
	
	
}
