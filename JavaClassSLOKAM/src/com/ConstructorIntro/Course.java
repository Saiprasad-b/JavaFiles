package com.ConstructorIntro;

public class Course {
	private String cName;
	private int cId;
	private double cFee;
	
	
	public Course(String cName, int cId, double cFee) {
		this.cName = cName;
		this.cId = cId;
		this.cFee = cFee;
	}


	public String getcName() {
		return cName;
	}


	public int getcId() {
		return cId;
	}


	public double getcFee() {
		return cFee;
	}
	
	
	
	
}
