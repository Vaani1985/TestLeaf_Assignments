package week2.day1;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println(bookTitle+ " book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("book issued successfully");
	}
	public static void main(String[] args) {
		Library obj1=new Library();
		obj1.addBook("Wings of fire");
		obj1.issueBook();
	}
}
