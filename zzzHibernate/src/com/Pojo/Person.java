package com.Pojo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pqual;
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "person")
	private Passsport passport;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPqual() {
		return pqual;
	}
	public void setPqual(String pqual) {
		this.pqual = pqual;
	}
	public Passsport getPassport() {
		return passport;
	}
	public void setPassport(Passsport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "pid--->" + pid + ", pname--->" + pname + ", page--->" + page + ", pqual--->" + pqual+", passport--->"+passport ;
	}
	
	
	

	
}
