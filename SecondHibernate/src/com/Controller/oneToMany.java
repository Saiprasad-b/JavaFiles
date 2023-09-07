package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.*;

public class oneToMany {
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

	public static void main(String[] args) {

		Person p = new Person();
		p.setPname("SaiPrasad");
		p.setPage(23);
		p.setPqual("B.Tech");

		Passport pass = new Passport();
		pass.setPptnum("ABC123");
		pass.setPptexp(2023);
		p.setPass(pass);

		
		  
		  
		  Mobile mobs = new Mobile();
		  mobs.setMnum(94912);
		  mobs.setMsim("jio");
		  
		  
		  Mobile mobs1 = new Mobile();
		  mobs1.setMnum(8500); 
		  mobs1.setMsim("airtel");
		  
		  
		  Mobile mobs2 = new Mobile();
		  mobs2.setMnum(78945);
		  mobs2.setMsim("bsnl");
		  
		  List<Mobile> mob = new ArrayList<>();
		  mob.add(mobs);
		  mob.add(mobs1);
		  mob.add(mobs2);
		  System.out.println(mob);
		  
		  
		  p.setMob(mob);
		 

		oneToOne o = new oneToOne();
		o.save(p);

	}
}
