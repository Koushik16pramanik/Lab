package com.Book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Book_Details")
public class Book {
	@Id  // primary key
	@Column
	private int Book_Id;
	private String Title;
	private String aurther;
	private double price;
	public int getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAurther() {
		return aurther;
	}
	public void setAurther(String aurther) {
		this.aurther = aurther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
