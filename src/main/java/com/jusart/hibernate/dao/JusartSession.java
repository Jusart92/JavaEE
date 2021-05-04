package com.jusart.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JusartSession {
	
	private Session session;
	
	public JusartSession() {

	    Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    SessionFactory sessionFactory = configuration.buildSessionFactory();
	    session = sessionFactory.openSession();
	    session.beginTransaction();
	}

	public Session getSession() {
	    return session;
	}


}
