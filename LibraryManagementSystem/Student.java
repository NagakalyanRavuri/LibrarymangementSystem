package LibraryManagementSystem;

public class Student extends User {
	int count = 0;

	public Student(int userId, String name) {
		super(userId, name);
		
	}

	public void borrowBooks(Book book,String name) {
		if(book.isAvailable && count<=3) {
		borrowedBooks.add(book);
		book.isAvailable = false;
		count++;
		System.out.println(book.getTitle()+" book has borrowed by Student "+name);
		}
		else if(count>3) {
			System.out.println(name+"! You have reached your Limit");
		}
		else {
			System.out.println("Book is not available");
		}
		
	}

	@Override
	public void returnBooks(Book book,String name) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.isAvailable = true;
			count--;
			System.out.println(book.getTitle()+" book has returned by student "+name);
		}
		else {
			System.out.println("You haven't borrowed this book");
		}
		
	}

	

	@Override
	public int getLimit() {
		System.out.print( "Maximum Limit for student to borrow books is: ");
		return 3;
	}

}
