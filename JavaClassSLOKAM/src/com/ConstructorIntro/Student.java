package com.ConstructorIntro;

public class Student {
	
	
	private int sId;
	private String sName;
	private String sLoc;
	private double sFee;
	private Course[] Scourse;
	
	
	public Student() {
		System.out.println("Def Constructor");
	}
	
	
	public Student(int id ,String name ,String Location ,double fee ,Course[] Scourse) {
		this.sId = id;
		this.sName = name;
		this.sLoc = Location;
		this.sFee =fee;
		this.Scourse = Scourse;
	}


	public int getsId() {
		return sId;
	}


	public String getsName() {
		return sName;
	}


	public String getsLoc() {
		return sLoc;
	}


	public double getsFee() {
		return sFee;
	}


	public Course[] getScourse() {
		return Scourse;
	}
	
	
	

}
