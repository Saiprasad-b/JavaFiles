package com.first;

public class Studentpojo {
	private int sid;
	private String sname;
	private double sage;
	private String squal;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSage() {
		return sage;
	}
	public void setSage(double sage) {
		this.sage = sage;
	}
	public String getSqual() {
		return squal;
	}
	public void setSqual(String squal) {
		this.squal = squal;
	}
	public Studentpojo(int sid, String sname, double sage, String squal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.squal = squal;
	}
	@Override
	public String toString() {
		return "sid->" + sid + ", sname->" + sname + ", sage->" + sage + ", squal->" + squal;
	}
	
	
	
}
