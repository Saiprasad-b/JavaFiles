package com.hashmap;

import java.util.Objects;


public class Student {

	

	private int sid;
	private String sName;
	private double sMarks;
	private String sQual;
	public int getSid() {
		return sid;
	}
	public Student() {};
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}
	public String getsQual() {
		return sQual;
	}
	public void setsQual(String sQual) {
		this.sQual = sQual;
	}
	public Student(int sid, String sName, double sMarks, String sQual) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sMarks = sMarks;
		this.sQual = sQual;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sName=" + sName + ", sMarks=" + sMarks + ", sQual=" + sQual;
	}
	@Override
	public int hashCode() {
	
		return Objects.hash(sMarks, sName, sQual, sid);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(sMarks) == Double.doubleToLongBits(other.sMarks)
				&& Objects.equals(sName, other.sName) && Objects.equals(sQual, other.sQual) && sid == other.sid;
	}
}
