package com.bookutil;

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