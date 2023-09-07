package com.StudentCourse;

public class Student {
	private int Sid;
	private String Sname;
	private double Smarks;
	private Course[] Scource;
	
	
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public double getSmarks() {
		return Smarks;
	}
	public void setSmarks(double smarks) {
		Smarks = smarks;
	}
	public Course[] getScource() {
		return Scource;
	}
	public void setScource(Course[] scource) {
		Scource = scource;
	}
	
	
}
