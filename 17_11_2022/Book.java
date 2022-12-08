package com.bookutil;

public class Book {
	private String BookId;
	private String Title;
	private String Author;
	private String Category;
	private float Price;
	// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		this.BookId = bookId;
		this.Title = title;
		this.Author = author;
		this.Category = category;
		this.Price = price;
	}
	// getters and setters
	public String getBookId() {
		return BookId;
	}
	public String getAuthor() {
		return Author;
	}
	public float getPrice() {
		return Price;
	}
	public String getCategory() {
		return Category;
	}
	public String getTitle() {
		return Title;
	}


		
	public boolean validation() throws Exception {
		if(Category == "Science" || Category == "Fiction" || Category == "Technology" || Category == "Others" && Price > 0 &&
				BookId.startsWith("B") && BookId.length() <= 4) {
			return true;
		} else {
			
			throw new InvalidBookException("Invalid Data...");
		}
		
	}
	
}
class InvalidBookException extends Exception {
	public InvalidBookException(String s) {
		super(s);
	}
}

