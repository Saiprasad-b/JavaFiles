package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Course;
import com.Entity.Mobile;
import com.Entity.Passport;
import com.Entity.Person;

public class ManytoMany {
	
	public void save(Person p) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		
		p.setPname("SaiRaj");p.setPage(22);p.setPqual("B.Tech");

		Passport pass = new Passport();
		pass.setPptnum("VSR998");pass.setPptexp(2023);p.setPass(pass);
		  
		
		Mobile mobs = new Mobile(); mobs.setMnum(996633);mobs.setMsim("Docomo");
		  
		Mobile mobs1 = new Mobile(); mobs1.setMnum(778899); mobs1.setMsim("idea");
		  
		Mobile mobs2 = new Mobile(); mobs2.setMnum(445566);mobs2.setMsim("VI");
		  
		List<Mobile> mob = new ArrayList<>();
		mob.add(mobs);mob.add(mobs1);mob.add(mobs2); System.out.println(mob);
		  
		p.setMob(mob);//setting mobile in to person
			
		Course c = new Course(); c.setCname("Python");c.setCdur(6);
			  
		Course c1 = new Course(); c1.setCname("Django");c1.setCdur(3);
			  
			  
		Course c2 = new Course(); c2.setCname("JDBC");c2.setCdur(1);
			  
			  
		List<Course> cou = new ArrayList<>(); cou.add(c);cou.add(c1);cou.add(c2);
			  
		p.setCou(cou);//setting course in to person
			 		 		  
		ses.save(p);
		tr.commit();
	}
	public void update(int pid) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		Person p =new Person();
		p = (Person) ses.get(Person.class, pid);
		System.out.println("Before Updation"+p);
		//p.setPage(21);//chage sairaj age to 21
		List<Mobile> mobs = p.getMob();
		for(Mobile m : mobs ) {
			if(m.getMsim().equals("Docomo")) {
				m.setMsim("Reliance");//here Docomo sim changed to Reliance in SaiRaj
			}
			
		}
		ses.update(p);
		System.out.println("After Updation"+p);
		tr.commit();
		
	}
	
	public Person getById(int pid) {
		Person p  = new Person();
		Session ses = HibernateSesssion.getSession();
		p = (Person) ses.get(Person.class, pid);
		return p;
	}
	public void deleteById(int pid) {
		Person p  = new Person();
		Session ses = HibernateSesssion.getSession();
		Transaction tr =ses.beginTransaction();
		p = (Person) ses.get(Person.class, pid);
		ses.delete(p);
		tr.commit();
	}
	
	public void getAll() {
		
		List<Person> p  = new ArrayList<>();
		Session ses = HibernateSesssion.getSession();
		Query q = ses.createQuery("from Person");
		List<Person> lst = q.list();
		for(Person pr : lst) {
			System.out.println(pr);
		}
		
	}

	public static void main(String[] args) {

		
		  Person p = new Person();
		  ManytoMany m = new ManytoMany();
		  //m.save(p);
		  //m.update(4);
		 //System.out.println(m.getById(4));
		//m.deleteById(4);
		  m.getAll();
}
}
