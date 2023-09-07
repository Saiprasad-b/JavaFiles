package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue
	private int mid;
	
	private int mnum;
	private String msim;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	
	
	public Mobile(int mid, int mnum, String msim) {
		super();
		this.mid = mid;
		this.mnum = mnum;
		this.msim = msim;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mnum=" + mnum + ", msim=" + msim + "]";
	}
	
	
}
