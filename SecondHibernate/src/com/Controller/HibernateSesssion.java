package com.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateSesssion {
	public static SessionFactory sf =null;

	public static Session getSession() {
		
		
		Configuration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		if(sf==null)
		{
		 sf=con.buildSessionFactory();
		}
		Session session =  sf.openSession();
		return session;
		
	}
	
	
	
}
