package Day04.obj1;

public class Book {
	private String author = "�?진근";
	private int price;
	private String publisher;
	private String regdate;
	private String bookName;
	
	//(alt shift s) + o ?��?��?��
	//(alt shift s) + r getter, setter
	//(alt shift s) + s toString
	//(alt shift s) + v ?��버라?��?��
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
	public Book() {
		this("");

	}

	public Book(String author) {
//		this.author = author;
		this(author,0);
	}

	public Book(String author, int price) {
//		this.author = author;
//		this.price = price;
		this(author,0,"");
	}

	public Book(String author, int price, String publisher) {
//		this.author = author;
//		this.price = price;
//		this.publisher = publisher;
		this(author,0,publisher,"");
	}

	public Book(String author, int price, String publisher, String regdate) {
//		this.author = author;
//		this.price = price;
//		this.publisher = publisher;
//		this.regdate = regdate;
		this(author,0,publisher,regdate,"");
	}

	public Book(String author, int price, String publisher, String regdate, String bookName) {
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.regdate = regdate;
		this.bookName = bookName;
	}
	
	public Book(Book obj) {
		this.author = obj.author;
		this.price = obj.price;
		this.publisher = obj.publisher;
		this.regdate = obj.regdate;
		this.bookName = obj.bookName;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", publisher=" + publisher + ", regdate=" + regdate
				+ ", bookName=" + bookName + "]";
	}

	
	public static void main(String[] args) {
		Book b1 = new Book("진근",1000,"비트","2023-03-23","?���?");
		Book b2 = new Book(b1);
		
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
