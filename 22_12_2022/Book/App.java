package com.Book;

import java.util.Scanner;

import com.Book.daoimpl.UserImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		UserImpl um = new UserImpl();
		char ans;
		Scanner s= new Scanner(System.in);
		System.out.println("-----------Welcome to Book Record System---------------");
		System.out.println("Enter Choice");
		System.out.println(" 1. Add \n 2. Read \n 3. Exit");
		int ch = s.nextInt();
		do {
			switch (ch) {
			case 1: 
				um.add(null);
				break;
			case 2:
				um.fetch(0);
				break;
			case 3:
				System.exit(3);
				break;
				default :
					System.out.println("Invalid Choice");
					break;
			}
			System.out.println("Do you want to do the process again ? y/n");
			ans = s.next().charAt(3);
		}
		while (ans == 'y' || ans == 'Y');
		{
			System.out.println("Thank you !");
		}

	}
}
