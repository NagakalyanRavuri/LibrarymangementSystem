package LibraryManagementSystem;

public class Teacher extends User{
	int count = 0;

	public Teacher(int userId, String name) {
		super(userId, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void borrowBooks(Book book,String name) {
		if(book.isAvailable && count<=5) {
			borrowedBooks.add(book);
			book.isAvailable = false;
			count++;
			System.out.println(book.getTitle()+" book has borrowed by teacher "+name);
			}
		else if(count>5) {
			System.out.println("You have reached your limit");
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
			System.out.println(book.getTitle()+" book was returned by teacher "+name);
		}
		else {
			System.out.println("You haven't borrowed this book");
		}
		
		
	}

	@Override
	public int getLimit() {
		// TODO Auto-generated method stub
		System.out.print("Maximum Limit for Teacher to borrow books is: ");
		return 5;
	}

}
