package com.empPojo;

public class Employee {
	
	private int eid;
	private String eName;
	private double eSal;
	private String eDept;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	public Employee(int eid, String eName, double eSal, String eDept) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSal = eSal;
		this.eDept = eDept;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "eid-->" + eid + ", eName-->" + eName + ", eSal-->" + eSal + ", eDept-->" + eDept;
	}
	

}
