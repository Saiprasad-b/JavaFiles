package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private int pptid;
	private int pptexp;
	private String pptnum;
	public int getPptid() {
		return pptid;
	}
	public void setPptid(int pptid) {
		this.pptid = pptid;
	}
	public int getPptexp() {
		return pptexp;
	}
	public void setPptexp(int pptexp) {
		this.pptexp = pptexp;
	}
	public String getPptnum() {
		return pptnum;
	}
	public void setPptnum(String pptnum) {
		this.pptnum = pptnum;
	}
	@Override
	public String toString() {
		return "Passport [pptid=" + pptid + ", pptexp=" + pptexp + ", pptnum=" + pptnum + "]";
	}
	public Passport(int pptid, int pptexp, String pptnum) {
		super();
		this.pptid = pptid;
		this.pptexp = pptexp;
		this.pptnum = pptnum;
	}
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
