package bookManagement;

public class Book {
	private String title;	// 제목
	private String author; // 저자
	private int price; //가격
	
	public Book() {;}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("책 제목 : " + getTitle() +"\n책 저자 : " + getAuthor() + "\n책 가격 : "+ getPrice());
	}

	
}
