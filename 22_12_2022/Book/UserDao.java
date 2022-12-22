package com.Book.dao;

import com.Book.entity.Book;

// data access object class
public interface UserDao {
	// for add employee entity
	// create
	public void add(Book b);
	// read
	public void fetch(int book_Id);
}
