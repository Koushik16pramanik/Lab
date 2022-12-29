package com.SpringJdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext ac= new ClassPathXmlApplicationContext("com/SpringJdbc1/spconfig.xml");
     
     Dao dao = ac.getBean("DaoImpl",Dao.class);
     Student sc = new Student();
     sc.setId(10);
     sc.setName("Massi");
     sc.setEmail("wc@gmail.com");
     sc.setAge(38);
     sc.setAddress("Barselona");
     
     int rs = dao.insert(sc);
     System.out.println(rs);
    }
}
