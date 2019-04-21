package com.bilgeadam.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.models.Student;

public class TestStu {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student("Ali  Veli");
		Student stu2 = session.find(Student.class, 3);
		stu2.setName("Hasan Türk");
		session.saveOrUpdate(stu2);
//		System.out.println("Saved data id = " + d);
		
		transaction.commit();
		
		System.out.println("Student is persisted");

		session.clear();
		session.close();
		sf.close();
		
	}

}
