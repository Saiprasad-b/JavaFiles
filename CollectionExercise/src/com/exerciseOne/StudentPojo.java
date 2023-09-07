package com.exerciseOne;

import java.util.Objects;

public class StudentPojo implements Comparable<StudentPojo>{
	private String sName;
	private int sId;
	private double sMarks;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}
	public StudentPojo(String sName, int sId, double sMarks) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sMarks = sMarks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sMarks, sId, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPojo other = (StudentPojo) obj;
		return Objects.equals(sMarks, other.sMarks) && sId == other.sId && Objects.equals(sName, other.sName);
	}
	@Override
	public String toString() {
		return "sName->" + sName + ", sId->" + sId + ", sMarks->" + sMarks;
	}
	@Override
	public int compareTo(StudentPojo s) {
		
		return -s.getsName().compareTo(this.getsName());
	}
	
	
	
	
	
}
