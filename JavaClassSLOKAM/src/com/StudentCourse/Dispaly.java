package com.StudentCourse;

public class Dispaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// object is created of course class
		//and must the class course is initialized before calling it
		Course c = new Course();
		// for c object
		c.setCid(1011);
		c.setCname("Core JAVA");
		c.setCfee(12000);
		
		//if we have multiple objects so we can use the array
		//for c1 object
		
		Course c1 = new Course();
		c1.setCid(1012);
		c1.setCname("MySQL");
		c1.setCfee(10000);
		//we must create an array of courses
		Course[] cr = {c , c1};
		
		Student s =new Student();
		s.setSid(112);
		s.setSname("sai");
		s.setSmarks(98.9);
		s.setScource(cr);
		
		
	
		System.out.println("Student ID : " +s.getSid());
		System.out.println("Student Name : " +s.getSname());
		System.out.println("Student Marks : " +s.getSmarks());
		
		
		
		
		for (int i=0 ;i<=cr.length-1;i++) {
			System.out.println(cr[i].getCid()+"---"+cr[i].getCname()+"---"+cr[i].getCfee());
		}
	
	}

}
