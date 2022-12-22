package com.Book.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserUtil {   // util class
	public static Session activeSession() {
		Configuration config= new Configuration().configure();
			SessionFactory sf =config.buildSessionFactory();
			Session ss = sf.openSession();
			return ss;
	}
}
