package LibraryManagementSystem;

public class Book {
	private int bookId;
	private String title;
	private String author;
	 boolean isAvailable;
	public Book(int bookId, String title, String author, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	public int getBookId() {
		return bookId;
	}
	@Override
	public String toString() {
		return "bookId=" + bookId + ", title=" + title + ", author=" + author;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
