package Bookmanagementsystem;

public class Book {
private int bookId;
private String bookName;
private String Author;
private double bookPrice;

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthor() {
	return Author;
}

public void setAuthor(String author) {
	Author = author;
}

public double getBookPrice() {
	return bookPrice;
}

 
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}

//constructor using fields
public Book(int bookId, String bookName, String author, double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.Author = author;
	this.bookPrice = bookPrice;
}
//constructor using superclass
public Book() {
	super();
}
}
