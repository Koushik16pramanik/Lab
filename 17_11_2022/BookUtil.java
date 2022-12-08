package com.bookutil;

import java.util.ArrayList;
import java.util.Scanner;

public class BookUtil {
	public static void main(String ...args) {  // main method
		// initializing BookStore 
		BookStore bs = new BookStore();
		// for loop to take user input 
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter BookId:- ");
			Scanner addBookId = new Scanner(System.in);   // get a scanner class
			String bookId = addBookId.nextLine();
			System.out.println("Enter Title:- ");
			Scanner addtitle = new Scanner(System.in);
			String title = addtitle.nextLine();
			System.out.println("Enter Author Name:- ");
			Scanner addAuthor = new Scanner(System.in);
	//	String …
 //		Scanner addSA = new Scanner(System.in);
//				String SA = addSA.nextLine();
//				bs.searchByAuthor(SA);
				bs.searchByTitle("Java");
//				bs.searchByAuthor("Mr.XYZ");
//				bs.displayAll();
			}
		}}

class Book {
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

class BookStore {
	// get a array list class
	private ArrayList<Book> bookColl = new ArrayList<>();
	public void addBook(Book b) {
			bookColl.add(b);
	}
	// method to search books by author name
			public void searchByAuthor(String author) {
				if(bookColl.stream().anyMatch(b->{return author.equalsIgnoreCase(b.getAuthor());})) {
					System.out.println(bookColl);
				} else {
					System.out.println("Author not found!");
				}}
	// method to search books by title
	public void searchByTitle(String title) {
		if(bookColl.stream().anyMatch(b->{return title.equalsIgnoreCase(b.getTitle());})) {
			System.out.println(bookColl);
		} else {
			System.out.println("Title not found!");
		}}
		// method to print all book details
		public void displayAll() {
			for(Book b : bookColl) {
				System.out.println("Book-Id:- " + b.getBookId() + " Title:- " + b.getTitle() + " Author:- " + b.getAuthor()
				+ " Category:- " + b.getCategory() + " Price:- " + b.getPrice());
			}

		}
		}