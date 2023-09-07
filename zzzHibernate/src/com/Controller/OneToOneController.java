package com.Controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Pojo.Passsport;
import com.Pojo.Person;

public class OneToOneController {
	public static void savePerson(Person pers) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr =ses.beginTransaction();
		ses.save(pers);
		tr.commit();
	}
	
	public static void getDataById(int pid) {
		Session ses = HibernateSesssion.getSession();
		//Transaction tr = ses.beginTransaction();
		Person pr=(Person) ses.get(Person.class, pid);
		System.out.println(pr);
		ses.close();
		HibernateSesssion.sf.close();
		
	}
	public static void delete(int pid) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		Person pr=(Person) ses.get(Person.class, pid);
		ses.delete(pr);
		tr.commit();
		HibernateSesssion.sf.close();
		
	}
	
	
	public static void update(int pid) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		Person pr=(Person) ses.get(Person.class, pid);
		System.out.println("Original Data--->"+ pr);
		pr.setPage(34);
		pr.getPassport().setPptexp(2099);
		ses.update(pr);
		System.out.println("After Update Data--->"+ pr);
		tr.commit();
		ses.close();
		
	}
	
	public static List<Person> getAll() {
		Session ses = HibernateSesssion.getSession();
		//Transaction tr = ses.beginTransaction();
		Query q = ses.createQuery("from Person");
		return q.list();
		
	}
	public static void main(String[] args) {
		
		
		/*Person pers = new Person();
		pers.setPname("Mahesh");
		pers.setPage(25);
		pers.setPqual("Msc");
		
		
		
		Passsport passport = new Passsport();
		passport.setPptnum("456FGD");
		passport.setPptexp(2022);
		pers.setPassport(passport);
		
		passport.setPerson(pers);*/
		
		//OneToOneController.savePerson(pers);
		//OneToOneController.getDataById(1);
		//OneToOneController.update(2);
	/*	List<Person> lst = OneToOneController.getAll();
		
		for (Person person : lst) {
			System.out.println(person);}
		*/
		OneToOneController.delete(2);
	}

}
