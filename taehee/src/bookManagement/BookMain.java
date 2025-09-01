package bookManagement;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("해리포터", "adfsdfkg", 15000);
//		book.printInfo();
		
		Book ebook = new EBook();
//		ebook.printInfo();
		((EBook)ebook).printInfo("안녕");
		
	}
}
