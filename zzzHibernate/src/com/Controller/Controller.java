package com.Controller;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.Pojo.Student;
import com.Pojo.employee;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;

public class Controller {
	//to update or delete save use Transaction object
	
	
	public void save(employee e) {
		
		Session ses  = HibernateSesssion.getSession();//user class
		Transaction tr =  ses.beginTransaction();
		ses.save(e);
		tr.commit();
		ses.close();
		
	
	}
	
	public employee getById(int eid) {
		Session ses=  HibernateSesssion.getSession();
		employee e = (employee) ses.get(employee.class, eid);
		ses.close();
		return e;

	}
	
	public void deleteById(int eid) {
		
		
		
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		employee emp = (employee) ses.get(employee.class, eid);
		ses.delete(emp);
		System.out.println("Deleted object---->"+emp);
		tr.commit();
		ses.close();
		
		
	}
	
	public void updateById(int eid) {
		Session ses= HibernateSesssion.getSession();
		Transaction tr =  ses.beginTransaction();
		employee e = (employee) ses.get(employee.class, eid);
		System.out.println("Actual data before Updation--->"+e);
		e.setEsal(778899.99);
		e.setEdesg("Owner");
		ses.update(e);
		tr.commit();
		System.out.println("After Updation---->"+e);
	}
	
	
	public List<employee> getAll(){
		
		
		Session ses= HibernateSesssion.getSession();
		Transaction tr =  ses.beginTransaction();
		
		Query q= ses.createQuery("from employee");
		List<employee>lst = q.list();
		return lst;
		
	}
	
	
	public static void main(String[] args) {
		employee e = new employee();
		e.setEname("jatayu");
		e.setEsal(7788.99);
		e.setEdesg("Founder");
		
		
		Controller c = new Controller();
		//c.save(e);
		//System.out.println(c.getById(1));
		//c.deleteById(3);
		//c.updateById(2);
		System.out.println(c.getAll());
	}
}