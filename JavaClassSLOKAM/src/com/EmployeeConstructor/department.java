package com.EmployeeConstructor;


public class department {
	private int dId;
	private String dName;
	private String dRole;
	public department(int dId, String dName, String dRole) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dRole = dRole;
	}
	public int getdId() {
		return dId;
	}
	public String getdName() {
		return dName;
	}
	public String getdRole() {
		return dRole;
	}
	

}
