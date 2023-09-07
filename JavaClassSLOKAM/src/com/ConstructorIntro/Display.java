package com.ConstructorIntro;

public class Display {

	public static void main(String[] args) {
		
		
		
		Course c1= new Course("Java" ,1012 ,2000.00);
		Course c2= new Course("Python" ,1013 ,6000.00);
		Course[] courseArray = {c1,c2};
		Student s1 = new Student(101,"SaiPrasad", "Karimnagar" ,12000.00,courseArray);
		System.out.println(s1.getsId());
		System.out.println(s1.getsName());
		System.out.println(s1.getsLoc());
		System.out.println(s1.getsFee());
		
		
		for(int i=0;i<=courseArray.length-1;i++) {
			System.out.println(
		courseArray[i].getcId()+"-----"+courseArray[i].getcName()+"-----"
		+courseArray[i].getcFee());
		}
		
		
	}

}
