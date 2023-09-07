package com.Pojo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passsport {
@Id
@GeneratedValue
	private int pptid;
	private int pptexp;
	private String pptnum;
	@OneToOne
	@JoinColumn(name = "fkpid")
	private Person person;
	
	
	
	
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
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "pptid--->" + pptid + ", pptexp--->" + pptexp + ", pptnum--->" + pptnum;
	}
	
	
	
	
	
	
	
}
