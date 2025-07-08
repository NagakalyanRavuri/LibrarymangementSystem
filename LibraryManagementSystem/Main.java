package LibraryManagementSystem;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book(101, "Atomic Habits", "James clear",true);
		Book book2 = new Book(102,"Rich Dad Poor Dad", " Robert Kiyosaki" ,true);
		Book book3 = new Book(103,"Zero to One" ,"Peter Thiel",true);
		Book book4 = new Book(104,"The Psychology of Money","Morgan Housel",true);
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin(11100,"Kalyan");
		Library library = new Library();
		System.out.println("Welcome to Library");
		System.out.print("Enter 1 for Admin\nEnter 2 for User\nEnter your choice: ");
		int au = sc.nextInt();
		if(au == 1) {
			System.out.print("please Enter Admin Id: ");
			long id = sc.nextLong();
			if(admin.getAdminId() == id) {
				System.out.println("Enter 1 to add books to library\nEnter 2 to remove book from library");
				System.out.print("Enter your choice: ");
				int ar = sc.nextInt();
				if(ar == 1) {
					admin.addBook(book1, library);
					admin.addBook(book2, library);
					admin.addBook(book4, library);
					admin.addBook(book3, library);
				}
				else if(ar ==2) {
					admin.removeBook(library, book4);
				}else {
					System.out.println("Invalid number0");
				}
			}else {
				System.out.println("Invalid admin Id");
			}
		}else if(au == 2) {
			System.out.println("Enter 1 if you are Student\nEnter 2 if you are Teacher");
			System.out.print("Enter your choice: ");
			int ts = sc.nextInt();
			if(ts == 1) {
				System.out.print("Enter your id: ");
				int stuId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your name: ");
				String stuName = sc.nextLine();
				User student1 = new Student(stuId,stuName);
				
				System.out.println("press 1 to borrow book\npress 2 to return book");
				System.out.println("Enter your choice: ");
				int br = sc.nextInt();
				if(br == 1) {
					student1.borrowBooks(book4, stuName);
				}
				else if(br ==2) {
					student1.returnBooks(book4, stuName);
				}
				else {
					System.out.println("Invalid choice");
				}
			}
			else if(ts == 2) {
				System.out.print("Enter your id: ");
				int teaId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your name: ");
				String teaName = sc.nextLine();
				User teacher1 = new Student(teaId,teaName);
				
				System.out.println("press 1 to borrow book\npress 2 to return book");
				System.out.println("Enter your choice: ");
				int br = sc.nextInt();
				if(br == 1) {
					teacher1.borrowBooks(book4, teaName);
				}
				else if(br ==2) {
					teacher1.returnBooks(book4, teaName);
				}
				else {
					System.out.println("Invalid choice");
				}
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		

	}

}
