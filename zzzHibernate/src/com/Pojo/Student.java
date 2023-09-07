package com.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String city;
	private String course;
	public int getSid() {
		return sid;
	}
	public Student() {}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city + ", course=" + course + "]";
	}
	public Student(String sname, String city, String course) {
		super();
		this.sname = sname;
		this.city = city;
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}
