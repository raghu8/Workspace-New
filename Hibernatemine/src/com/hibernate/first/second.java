package com.hibernate.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class second {

	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		first e1 = new first();
		e1.setName("hello");
		e1.setDepartment("how");
		e1.setId("115");

		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}
}