package com.pojo;

public class ProductPojo {

	private int pid;
	private String pname;
	private String pversion;
	private String pdate;
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
	public String getPversion() {
		return pversion;
	}
	public void setPversion(String pversion) {
		this.pversion = pversion;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public ProductPojo(int pid, String pname, String pversion, String pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pversion = pversion;
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "ProductPojo [pid=" + pid + ", pname=" + pname + ", pversion=" + pversion + ", pdate=" + pdate + "]";
	}
	
	
}
