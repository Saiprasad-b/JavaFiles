package com.EmployeeConstructor;


public class Employee {
	private int eId;
	private String eName;
	private Location eLoc;
	private department[] dep;
	
	
	public Employee(int eId, String eName, Location eLoc, department[] dep) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eLoc = eLoc;
		this.dep = dep;
	}
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public Location geteLoc() {
		return eLoc;
	}
	public department[] getDep() {
		return dep;
	}
	
	
	
	
}
