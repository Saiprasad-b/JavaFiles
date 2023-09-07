package com.pojo;

public class CustomerPojo {
	private int cid;
	private String cname;
	private String cloc;
	private String cbug;
	private String cstatus;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCloc() {
		return cloc;
	}
	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
	public String getCbug() {
		return cbug;
	}
	public void setCbug(String cbug) {
		this.cbug = cbug;
	}
	public String getCstatus() {
		return cstatus;
	}
	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}
	public CustomerPojo(int cid, String cname, String cloc, String cbug, String cstatus) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cloc = cloc;
		this.cbug = cbug;
		this.cstatus = cstatus;
	}
	public CustomerPojo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", cbug=" + cbug + ", cstatus="
				+ cstatus;
	}

	
	
}
