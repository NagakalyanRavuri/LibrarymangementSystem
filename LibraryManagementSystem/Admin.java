package LibraryManagementSystem;

public class Admin {
	private long adminId;
	private String adminName;
	
	public Admin(long adminId,String adminName) {
		this.adminId = adminId;
		this.adminName = adminName;
	}
	
	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void addBook(Book book,Library lib) {
	    lib.registerBook(book);
	}
	public void removeBook(Library lib,Book book) {
		lib.removeBooks(book);
	}
}
