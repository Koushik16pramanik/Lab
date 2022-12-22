package com.Book.daoimpl;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Book.dao.UserDao;
import com.Book.entity.Book;
import com.Book.hibernateUtil.UserUtil;




public class UserImpl implements UserDao {
	public void add(Book b) {
		try {
			Session session = UserUtil.activeSession();
			Transaction t= session.beginTransaction();
			session.save(b);
			t.commit();
			session.close();
		}
		catch (HibernateException e1) {
			System.out.println(e1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void fetch(int book_Id) { 
		try {
			Session session = UserUtil.activeSession();
			Book book= session.get(Book.class, book_Id);
			JOptionPane.showMessageDialog(null,"Book_Id: '"+book.getBook_Id()+"' "+"Title: '"+book.getTitle()+"' "+"Aurther: '"+book.getAurther()+"' "+"Price: '"+book.getPrice()+"' ");
			session.close();
		}
		catch (HibernateException e1) {
			System.out.println(e1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
