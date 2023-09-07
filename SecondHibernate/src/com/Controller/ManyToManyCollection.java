package com.Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Person;

public class ManyToManyCollection {
	
	
	public void savePerson(Person p) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		ses.save(p);
		tr.commit();
	}
	
	public void getOnetoOne(int pid) {
		Session ses = HibernateSesssion.getSession();
		
	}
	public static void main(String[] args) {

		
	}
}
