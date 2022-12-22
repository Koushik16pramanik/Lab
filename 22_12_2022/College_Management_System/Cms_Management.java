package com.Cms;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Cms.Entity.Student;

public class Cms_Management {
	static SessionFactory s;
	public static void main( String[] args ) {
	try {
	s = new Configuration().configure().buildSessionFactory();
	} catch (Exception e) {
	System.out.println(e);
	}
	Cms_Management cms = new Cms_Management();
	cms.addCMS(1, "Koushik","Pramanik",1500,123456789,"koushikpramanik@gmail.com");
	cms.addCMS(2, "Arnab", "Das", 2000, 987654321, "arnabdas@gmail.com");
	cms.readdetails();
	cms.updateStudent(2);
	cms.deleteStudent(2);
	}
	private void addCMS(int Id, String firstName, String lastName, double fees, long phone, String email) {
		try {
			Session	ses = s.openSession();
			Transaction t = ses.beginTransaction();
			Student e = ses.get(Student.class,Id);
			e.setFees(fees);
			ses.update(e);
			t.commit();
			System.out.println("Updated Successfully");
			} catch (Exception e) {
			System.out.println(e);
			}
	}
	private void readdetails() {
		try {
			Session ses = s.openSession();
			List employees = ses.createQuery("from Employee").list();
			for(Iterator itr = employees.iterator();itr.hasNext();) {
				Student e = (Student) itr.next();	
			System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getFees()+" "+e.getPhone()+" "+e.getEmail());
			}
			} catch (Exception e) {
			System.out.println(e);
			}
		
	}
	private void updateStudent(int Fees) {
		try {
			Session	ses = s.openSession();
			Transaction t = ses.beginTransaction();
			Student e = ses.get(Student.class,Fees);
			e.setFees(Fees);
			ses.update(e);
			t.commit();
			System.out.println("Updated Successfully");
			} catch (Exception e) {
			System.out.println(e);
			}
		
	}
	private void deleteStudent(int i) {
		try {
			Session	ses = s.openSession();
			Transaction t = ses.beginTransaction();
			Student e = ses.get(Student.class,ses);
			ses.delete(e);
			t.commit();
			System.out.println("Deleted Succesfully");
			} catch (Exception e) {
			System.out.println(e);
			}
	}
}
