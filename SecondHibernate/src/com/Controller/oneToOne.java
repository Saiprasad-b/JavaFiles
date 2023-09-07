package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.*;


//Save , Update, Delete, getById ,getAll  

public class oneToOne {
	
	public void save(Person p) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		ses.save(p);
		tr.commit();
	}

	public void getById(int pid) {
		Session ses = HibernateSesssion.getSession();
		Person p = 	(Person)ses.get(Person.class,pid);
		System.out.println(p);

	}
	
	public void update(int pid) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		Person p = 	(Person)ses.get(Person.class,pid);
		System.out.println(p);
		p.setPname("sai");
		ses.update(p);
		
		tr.commit();
	}
	
	

	public static void main(String[] args) {

		Person p = new Person();
		p.setPname("SaiPrasad");
		p.setPage(23);
		p.setPqual("B.Tech");

		Passport pass = new Passport();
		pass.setPptnum("ABC123");
		pass.setPptexp(2023);
		p.setPass(pass);

		 

		oneToOne o = new oneToOne();
		//o.save(p);
		o.getById(1);

	}
}
