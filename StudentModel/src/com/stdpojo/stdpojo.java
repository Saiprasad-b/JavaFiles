package com.stdpojo;

import com.stdcontroller.stdcontroller;

public class stdpojo {

	
	private String sName;
	private int sId;
	private double sMarks;
	private String sQual;
	
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
public String getsQual() {
	return sQual;
}
public void setsQual(String sQual) {
	this.sQual = sQual;
}
@Override
public String toString() {
	return "sName=" + sName + ", sId=" + sId + ", sMarks=" + sMarks + ", sQual=" + sQual;
}





}
