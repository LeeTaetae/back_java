package bookManagement;

public class EBook extends Book{
	private int fileSize;
	
	public EBook() {;}
	
	
	public EBook(String title, String author, int price, int fileSize) {
		super(title, author, price);
		this.fileSize = fileSize;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	
	@Override
	public void printInfo() {
		System.out.println("책 제목 : " + getTitle() +"\n책 저자 : " + getAuthor() + "\n책 가격 : "+ getPrice() + "\n파일 크기 : " + getFileSize());
	}
	
	public void printInfo(String extra) {
		System.out.println("책 제목 : " + getTitle() +"\n책 저자 : " + getAuthor() + "\n책 가격 : "+ getPrice() + "\n추가메세지");
	}
}