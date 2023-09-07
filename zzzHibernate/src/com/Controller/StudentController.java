package com.Controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Pojo.Student;

public class StudentController {

	
	public static  void save(Student s) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		ses.save(s);
		tr.commit();
	
	}
	
	public static void getById(int sid) {
	
		Session ses = HibernateSesssion.getSession();
		Transaction tr = ses.beginTransaction();
		Student s = (Student)ses.get(Student.class, sid);
		System.out.println(s);
		
	}
	
	
	public static void deleteById(int sid) {
		Session ses = HibernateSesssion.getSession();
		Transaction tr= ses.beginTransaction();
		Student s = (Student) ses.get(Student.class, sid);
		ses.delete(s);
		tr.commit();
		System.out.println("Deleted Data"+s);
		
		
		
	}
	
	public static void update(int sid) {
		
		Session ses = HibernateSesssion.getSession();
		Transaction tr= ses.beginTransaction();
		Student s = (Student) ses.get(Student.class, sid);
		s.setCourse("C Lang");
		ses.update(s);
		tr.commit();
		
		
	}
	
	public static void getAll(){
		Session ses = HibernateSesssion.getSession();
		Transaction tr= ses.beginTransaction();
		//HQL(Hibernate Query Language) is used below
		Query q = ses.createQuery("from Student");//this is Pojo Class name not Table name in database
		List<Student>lst  = q.list();
		for (Student student : lst) {
			System.out.println(student);
		}	
	}
	
	
	public static void main(String[] args) {
		
		
		Student s= new Student("Jatayu" , "Hyd" , "Python");
		
		//StudentController.save(s);
	    //StudentController.deleteById(3);
		//StudentController.getById(2);
		//StudentController.update(2);
		StudentController.getAll();
		
	}
}